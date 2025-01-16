package com.prog;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet1")


public class LoginServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		req.getRequestDispatcher("Link.html").include(req, resp);
		
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		if (password.equals("jayesh123")) {
			out.print("welcome, "+name);
			
			HttpSession session = req.getSession();
			session.setAttribute("Name",name);
			
		}else {
			out.print("sorry ,username or password error!");
			req.getRequestDispatcher("Login.html").include(req, resp);
		}
		
		out.close();
		
		
	}
}
