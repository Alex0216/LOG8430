package webserver;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.Page;
import ca.polymtl.log8430.model.TP2.Ressource;
import ca.polymtl.log8430.model.TP2.TP2Factory;
import ca.polymtl.log8430.model.TP2.TP2Package;

/**
 * The class EMFHandler is responsible for handling HTTP
 * requests from the webserver. (ex: get Dossier)
 *
 */
public class EMFHandler extends AbstractHandler {
	
	public class RequestTypeInfo
	{
	    public RequestType mainType; 
	    public RequestType subType;  
	    public int position; 
	 };

	private final EObject root;

	public EMFHandler(EObject root) {
		this.root = root;
	}
	/**
	 * The handle method parse the http request and do the requested
	 * operation. For exemple, if the user want to see the folders,
	 * it'll communicate with the auth server and valdie the username
	 * and password.
	 */
	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		
		boolean authenticated = false;
		HttpClient httpClient = new HttpClient();
		String user = null;
		try {
			user = httpReq.getParameter("user").toString();
			String pwd = httpReq.getParameter("pwd").toString();
			httpClient.start();
			ContentResponse response = httpClient.GET(String.format("http://localhost:5003/?user=%s&pwd=%s", user, pwd));
			if(response.getStatus() == HttpServletResponse.SC_OK){
				authenticated = true;
			}
		} catch (Exception e) {
			System.out.println("Could not authenticate");
		} finally{
			try {
				httpClient.stop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Authentification was successfull
		if(authenticated){
			String method = httpReq.getMethod();
			
			String[] fragments = path.split("/");
			Object context = root;

			RequestTypeInfo typeInfo = getRequestTypeInfo(fragments);
			// match feature
			EObject eobject = (EObject) context;
			//find the feature
			EStructuralFeature feature;
			EObject newObject = null;
			if(method.equals("PUT")){
				newObject = handlePut(httpReq);
				
				feature = eobject.eClass().getEStructuralFeature(RequestType.RESSOURCES.getModeleName());
			}
			else {
				feature = eobject.eClass().getEStructuralFeature(typeInfo.mainType.getModeleName());
			}
			
			try {
				// call reflexively
				context  = eobject.eGet(feature);
				
				if(context instanceof EList) {
					EList list = (EList) context;
					
					if(method.equals("PUT")){
						Ressource r = (Ressource)newObject;
						r.setProprietaire(user);
						list.add(newObject);
						XMIResource xmiResource = new XMIResourceImpl();
						xmiResource.getContents().add(root);
						FileOutputStream out = new FileOutputStream(Activator.savedModel);
						xmiResource.save(out, Collections.emptyMap());
						out.close();
		
						context = list;
					}
					else {
						list = filterList(list, typeInfo.subType, user);
						if(typeInfo.position == -1) {
							context = list;
						}
						else if(typeInfo.position >=0 && typeInfo.position < list.size()){
							context = list.get(typeInfo.position);
						} else {
							context = new BasicEList();
						}
					}
				}	
				
			} catch (Exception e) {
				System.out.println("Error while parsing modele");
			}

			httpResp.setStatus(HttpServletResponse.SC_OK);
			httpResp.getWriter().println("Welcome to TP3");
			httpResp.getWriter().println(context);
			httpResp.flushBuffer();
			
		} else {
			httpResp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			httpResp.getWriter().println("Better luck next time.");
			httpResp.flushBuffer();
		}
	}
	/**
	 * This method parse the request to see if it is correct and if it
	 * has an index inside.
	 */
	private RequestTypeInfo getRequestTypeInfo(String[] fragments) {
		
		RequestTypeInfo info = null;
		// Null check. Also path is something like this "/ghg".
		// So the first item must always be empty else it is not a valid path.
		if(fragments == null || fragments.length < 2 || !fragments[0].isEmpty()){
			return info;
		}
		
		info = new RequestTypeInfo();
		info.mainType = RequestType.fromString(fragments[1]);
		info.subType = RequestType.fromString(fragments[1]);
		for(int i = 1; i < fragments.length; i++){
			info.subType = RequestType.fromString(fragments[i]);
			
			// Error in the path, check if its due to an index. If not it means the path is not valid.
			if (info.subType == null) {
				try {
					info.position = Integer.parseInt(fragments[fragments.length - 1]);
					info.subType = RequestType.fromString(fragments[i-1]); // Bring the last valid one
				} catch (NumberFormatException e) {
					return null;
				}
			}
		}
		
		// Check for index at the end
		try {
			info.position = Integer.parseInt(fragments[fragments.length - 1]);
		} catch (NumberFormatException e) {
			info.position = -1;
		}
		
		return info;
	}
	/**
	 * Given a request, this method filter the ressources that a user
	 * has the right to access.
	 */
	private EList filterList(EList<EObject> list, RequestType type, String user) {
		if (list == null || list.size() == 0) {
			return null;
		}

		EList newList = new BasicEList();
		
		for(int i=0; i < list.size(); i++) {
			if(isClassValidForRequest(list.get(i), type)) {
				Ressource currentRes = (Ressource)list.get(i);
				// Validate if the Object was inserted from the user
				if(currentRes != null && currentRes.getProprietaire() != null && 
						currentRes.getProprietaire().equals(user)){
						newList.add(list.get(i));
				}
			}
		}
		
		return newList;
	}
	/**
	 * This method handle is called to determine if the object
	 * is of class folder, file etc..
	 */
	private boolean isClassValidForRequest(EObject o, RequestType type) {
		boolean isValid = false;
		
		boolean isFichier = o instanceof Fichier;
		boolean isDossier = o instanceof Dossier;
		boolean isPage = o instanceof Page;
		
		if (type == RequestType.COMMANDS) {
			isValid = true; // Une seule sorte de commande
		}
		else if (type == RequestType.RESSOURCES) {
			isValid = isFichier || isDossier || isPage;
		}
		else if (type == RequestType.RESSOURCES_DISTANT) {
			isValid = isPage;
		}
		else if (type == RequestType.RESSOURCES_LOCAL) {
			isValid = isFichier || isDossier;
		}
		else if (type == RequestType.RESSOURCES_FICHIER) {
			isValid = isFichier;
		}
		else if (type == RequestType.RESSOURCES_DOSSIER) {
			isValid = isDossier;
		}
		
		return isValid;
	}
	/**
	 * This method handles the adding of new files via JSON request
	 */
	private EObject handlePut(HttpServletRequest httpReq){
		
		try {
			BufferedReader br = httpReq.getReader();
			StringBuilder responseStrBuilder = new StringBuilder();
			
			String line = null;
		    while ((line = br.readLine()) != null) {
		    	responseStrBuilder.append(line);
		    }
		    br.close();
		    
		    JSONParser jsonParser = new JSONParser();
		    JSONObject object = (JSONObject)jsonParser.parse(responseStrBuilder.toString());
			
		    EMFParserJSON emfParser = new EMFParserJSON();
		    return emfParser.createObjectFromJSON(object);
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error while parsing the JSON from put method");
		}
		return null;
	}
}