package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.user.employ;

public class employDao {
    public static int registerEmployee(employ e) throws ClassNotFoundException {
        String sql = "INSERT INTO user" +
            "  (name, email, password) VALUES " +
            " (?, ?, ?,);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/hospital3","root","JAYESH787428@#");

            // Step 2:Create a statement using connection object
            PreparedStatement ps = connection.prepareStatement(sql)) {
          ps.setString(1, e.getName());
          ps.setString(2, e.getEmail());
          ps.setString(3, e.getPassword());
        	// preparedStatement.setString(1, employee.);
//            preparedStatement.setString(2, employee.Name());
//            preparedStatement.setString(3, employee.getLastName());
//            preparedStatement.setString(4, employee.getUsername());
//            preparedStatement.setString(5, employee.getPassword());
//            preparedStatement.setString(6, employee.getAddress());
//            preparedStatement.setString(7, employee.getContact());

            System.out.println(ps);
            // Step 3: Execute the query or update query
            result = ps.executeUpdate();

        } catch (SQLException E) {
            // process sql exception
            printSQLException(E);
        }
        return result;
    }

    private static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
	
	
}
