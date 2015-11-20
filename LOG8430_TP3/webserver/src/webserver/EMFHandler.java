package webserver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.function.Predicate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.handler.AbstractHandler;

import ca.polymtl.log8430.model.TP2.Dossier;
import ca.polymtl.log8430.model.TP2.Fichier;
import ca.polymtl.log8430.model.TP2.Page;


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

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		
		boolean authenticated = false;
		HttpClient httpClient = new HttpClient();
		try {
			String user = httpReq.getParameter("user").toString();
			String pwd = httpReq.getParameter("pwd").toString();
			httpClient.start();
			String test = String.format("http://localhost:5003/?user=%s&pwd=%s", user, pwd);
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
		
		if(authenticated){
			String[] fragments = path.split("/");
			Object context = root;

			RequestTypeInfo typeInfo = getRequestTypeInfo(fragments);
			
			try {
				// match feature
				EObject eobject = (EObject) context;
				//find the feature
				EStructuralFeature feature = eobject.eClass().getEStructuralFeature(typeInfo.mainType.getModeleName());
				// call reflexively
				context  = eobject.eGet(feature);
			} catch (Exception e) {
				System.out.println("Error while parsing modele");
			}


			if(context instanceof EList) {
				EList list = (EList) context;
				list = filterList(list, typeInfo.subType);

				if(typeInfo.position == -1) {
					context = list;
				}
				else {
					context = list.get(typeInfo.position);
				}

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

	private EList filterList(EList<EObject> list, RequestType type) {
		if (list == null || list.size() == 0) {
			return null;
		}

		EList newList = new BasicEList();
		
		for(int i=0; i < list.size(); i++) {
			if(isClassValidForRequest(list.get(i), type)) {
				newList.add(list.get(i));
			}
		}
		
		return newList;
	}
	
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
}