package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.net.jsse.PEMFile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class profile extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		Cookie[] ck=req.getCookies();
		
		if (ck==null) {
			resp.sendRedirect("index.html");
			
		}else {
			
			
			resp.setContentType("text/html");
				PrintWriter out = resp.getWriter();
				
				out.print("<h1>Email="+ck[0].getValue()+"</h1>");
				out.print("<h1>Password="+ck[1].getValue()+"</h1>");
				
				out.println("<a href='logout'>Logout</a>");
			
		}
		
		
		
		
	}
	

}
