package com.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.employDao;
import com.user.employ;


/**
 * Servlet implementation class Employeeservlet
 */
@WebServlet("/register")
public class Employeeservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private employ em = new employ();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Employeeservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("empol.jsp");
		//dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String email=request.getParameter("email");
		String password = request.getParameter("password");
		
		employ emp = new employ();
		emp.setName(name);
		emp.setEmail(email);
		emp.setPassword(password);
		
		
		try {
			employDao.registerEmployee(emp);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		//dispatcher.forward(request, response);
		
	}

}
