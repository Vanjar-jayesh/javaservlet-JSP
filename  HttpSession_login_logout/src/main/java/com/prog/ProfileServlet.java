package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		req.getRequestDispatcher("Link.html").include(req, resp);
		
		HttpSession session = req.getSession(false);
		
		if (session!=null) {
			String name = (String)session.getAttribute("Name");
			
			out.print("Hello,"+name+"welcome to profile");
			
			
		}else {
			out.print("Please login first");
			
			req.getRequestDispatcher("Login.html").include(req, resp);
			
		}

		out.close();
		
	}

}
