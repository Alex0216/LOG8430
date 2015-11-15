package authentificationServer;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class AuthHandler extends AbstractHandler {

	private Map<String, String> usersPwd;
	
	public AuthHandler(Map<String, String> map) {
		usersPwd = map;
	}

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {
		String user = null;
		String pwd = null;
		try
		{
			user = httpReq.getParameter("user").toString();
			pwd = httpReq.getParameter("pwd").toString();
		} catch(Exception e){
			System.out.println("Error while trying to authenticate");
		}
		
		if(usersPwd.get(user) != null && usersPwd.get(user).equals(pwd)) {
			httpResp.setStatus(HttpServletResponse.SC_OK);
			httpResp.getWriter().println("<h1>Authentification sucessfull</h1>");
		} else {
			httpResp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
			httpResp.getWriter().println("<h1>Authentification failed</h1>");
		}
		
		httpResp.flushBuffer();
	}
}