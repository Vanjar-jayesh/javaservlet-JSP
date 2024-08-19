package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class progrm_02 extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Gerjsks akjslaj");
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("Date=" +new Date().toString() );
		
		
	}

}
