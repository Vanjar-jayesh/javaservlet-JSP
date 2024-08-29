package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String Name = req.getParameter("na");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<h1> Name:"+Name+"</h1>");
		
		out.println("<a href='servlet2?username="+Name+"'>servlet_2</a>");
		
		
	}
}
