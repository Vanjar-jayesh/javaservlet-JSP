package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.user;

public class UserDao {

	private Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	
	public boolean register(user u) {
		boolean f = false;
		
		try {
			
			String sql="insert into user(name,email,password) values(?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, u.getName());
			ps.setString(2, u.getEmail());
			ps.setString(3, u.getPassword());
			
			int i =ps.executeUpdate();
			
			if (i==1) {
				f=true;
				//System.out.println("");
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}
		
		
		return f;
	}
}
