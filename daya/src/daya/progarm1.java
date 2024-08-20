/**
 * 
 */
package daya;
//import java.sql.*;

import java.sql.*;
public class progarm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        String url ="jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "JAYESH787428@#";
        String query = "select * from employyess";
        try{
            Class.forName("com.mysql.jdbc.driver");
            System.out.println("driver loaded");
        }catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try{
                Connection con = DriverManager.getConnection(url,username,password);
                System.out.println("connection established successfully");
                 Statement stmt = con.createStatement();
                 ResultSet rs = stmt.executeQuery(query);
                 while(rs.next()){
                     int id = rs.getInt("id");
                     String name = rs.getString("name");
                     String job_title = rs.getString("job_title");
                     Double salary = rs.getDouble("salary");
                     System.out.println();
                     System.out.println("===================================");
                     System.out.println("ID: " + id);
                     System.out.println("Name: " + name);
                     System.out.println("Job Title: " + job_title);
                     System.out.println("Salary: " + salary);

                 }
                 rs.close();
                 stmt.close();
                 con.close();
            System.out.println("connection closed successfully");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
	}
}
