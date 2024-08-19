package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import org.w3c.dom.ls.LSOutput;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class firstprogrm implements Servlet
{
	
	ServletConfig con;
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy methoda call");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return con;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "my first program";
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init methoda call");
		con=config;
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("service methoda call 2");
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		//out.println("heloodsnl");
		out.println("today"+new Date().toString());
		System.out.println(getServletConfig());
		System.out.println(getServletInfo());
		
	}

}
