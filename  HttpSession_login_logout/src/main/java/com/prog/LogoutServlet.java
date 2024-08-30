package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		req.getRequestDispatcher("Link.html").include(req, resp);
		
		HttpSession session = req.getSession();
		session.invalidate();
		
		out.print("you are successfully logged out!");
		
		out.close();
		
	}
}
