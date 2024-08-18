package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class secodServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("em");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print(email+"<h1>Welcome to home page:</h1>");
		
		
		
		
		
	}
	

}
