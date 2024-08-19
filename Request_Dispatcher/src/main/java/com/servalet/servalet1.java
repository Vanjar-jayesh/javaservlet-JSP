package com.servalet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Login")
// dircetcal run of webservlet :
		
public class servalet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String em = req.getParameter("em");
		String passowrd = req.getParameter("pa");

		resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd;
		
		
		if("jayesh@123.com".equals(em) && "jay".equals(passowrd)) {
			
//			// home page redirect
			/*
			 * rd=req.getRequestDispatcher("/servlet2"); 
			 * rd.forward(req, resp);
			 */
			
			resp.sendRedirect("servlet2");
			
			
		}
		else {
			// redirect logint page
			out.print("<h4>Invalid Email & password</h4>");
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
		
	}
	

}
