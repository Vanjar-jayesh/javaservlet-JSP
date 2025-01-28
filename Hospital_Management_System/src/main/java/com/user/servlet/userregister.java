package com.user.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.db.DBConnect;
import com.entity.user;

@WebServlet("user_register")
public class userregister extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			String name = req.getParameter("name");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			
			user u = new user(name, email, password);
			UserDao dao = new UserDao(DBConnect.getconn());
			
			boolean f=dao.register(u);
			
			if (f) {
				System.out.println("data insert succesfull");
			}else {
				System.out.println("something wrong on server");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
			
		
		
		
		
	}
}
