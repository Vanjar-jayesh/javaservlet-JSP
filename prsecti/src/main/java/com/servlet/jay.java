package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.PasswordAuthentication;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class jay  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String id = req.getParameter("id");
		String name = req.getParameter("na");
		String ad = req.getParameter("ad");
		String pssword = req.getParameter("pa");
		
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		out.println("<h2>id: "+id+"</h2>");
		out.println("<h2>nqme "+name+"</h2>");
		out.println("<h2>Adderss "+ad+"</h2>");
		out.println("<h2>password "+pssword+"</h2>");
		
	}
}
