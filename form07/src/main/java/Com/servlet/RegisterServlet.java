package Com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("user name");	
		String Email = req.getParameter("email");
		String password=req.getParameter("password");
		String course=req.getParameter("course");
		
		resp.setContentType("text/html");
	    PrintWriter out=resp.getWriter();
	    
	    out.print("<h1> Name : "+name+ "</h1>");
	    out.print("<h1> Email : "+Email+ "</h1>");
	    out.print("<h1> Passowrd: "+password+ "</h1>");
	    out.print("<h1> Couser : "+course+ "</h1>");
	    

	}
	
}
