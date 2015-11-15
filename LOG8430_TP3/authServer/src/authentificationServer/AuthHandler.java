package authentificationServer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class AuthHandler extends AbstractHandler {

	public AuthHandler() {
	}

	@Override
	public void handle(String path, Request req, HttpServletRequest httpReq, HttpServletResponse httpResp)
			throws IOException, ServletException {

		httpResp.setStatus(HttpServletResponse.SC_OK);
		httpResp.flushBuffer();
	}
}