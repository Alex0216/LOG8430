package webserver;

import java.io.IOException;
import java.util.function.Predicate;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jetty.server.Request;
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
		String method = httpReq.getMethod();

		String[] fragments = path.split("/");
		Object context = root;

		RequestTypeInfo typeInfo = getRequestTypeInfo(fragments);
		
		// match feature
		EObject eobject = (EObject) context;
		//find the feature
		EStructuralFeature feature = eobject.eClass().getEStructuralFeature(typeInfo.mainType.getModeleName());
		// call reflexively
		context  = eobject.eGet(feature);
		
			if(context instanceof EList) {
				EList list = (EList) context;
				list = filterList(list, typeInfo.subType);
			}

		httpResp.setStatus(HttpServletResponse.SC_OK);
		httpResp.getWriter().print(context);
		httpResp.flushBuffer();
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
		for(int i = 1; i < fragments.length; i++){
			info.subType = RequestType.fromString(fragments[i]);
			
			// Error in the path
			if (info.subType == null) {
				return null;
			}
		}
		
		return info;
	}

	private EList filterList(EList<EObject> list, RequestType type) {
		if (list == null || list.size() == 0) {
			return null;
		}
		
		for(int i = 0; i < list.size(); i++){
			list.removeIf(new Predicate<EObject>() {
					@Override
					public boolean test(EObject arg0) {
						return !isClassValidForRequest(arg0, type);
					}
				});
		}
		return list;
	}
	
	private boolean isClassValidForRequest(EObject o, RequestType type) {
		boolean isValid = false;
		
		boolean isFichier = o instanceof Fichier;
		boolean isDossier = o instanceof Dossier;
		boolean isPage = o instanceof Page;
		
		if (type == RequestType.RESSOURCES) {
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