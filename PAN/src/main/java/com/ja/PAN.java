package com.ja;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/PAN1")

public class PAN  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name= req.getParameter("na");
		String  Email= req.getParameter("em");
		String City = req.getParameter("ci");
		String adderss = req.getParameter("ad");
		int number = Integer.parseInt(req.getParameter("nu"));
		

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<h2> ID="+id+"</h2>");
		out.println("<h2> NAME="+name+"</h2>");
		out.println("<h2> EMAIL="+Email+"</h2>");
		out.println("<h2> CITY="+City+"</h2>");
		out.println("<h2> ADDERSS="+adderss+"</h2>");
		out.println("<h2> NUMBER="+number+"</h2>");
		
		
		
		
	}
}
