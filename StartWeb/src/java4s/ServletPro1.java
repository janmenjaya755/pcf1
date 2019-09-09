package java4s;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.servlet.http.*;

//@WebServlet("/xyz")
public class ServletPro1 extends HttpServlet {
	public void  service(ServletRequest req,ServletResponse res) throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("welcome to web");
		
	}

}
