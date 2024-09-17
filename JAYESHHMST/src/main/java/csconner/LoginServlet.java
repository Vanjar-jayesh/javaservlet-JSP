package csconner;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.ConnectionImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		try {
//			PrintWriter out=response.getWriter();
//			Class.forName("com.Mysql.cj.jdbc.Driver");
//			ConnectionImpl con=(ConnectionImpl) DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","JAYESH787428@#");
//			String n=request.getParameter("txtName");
//			String p=request.getParameter("txtPwd");
//			
//			PreparedStatement ps=con.prepareStatement("select name from login where name=? and password=?");
//			ps.setString(1,n);
//			ps.setString(2,p);
//			 ResultSet rs=ps.executeQuery();
//			 
//			 if(rs.next()) {
//				 RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
//				 rd.forward(request, response);
//			 }
//			 else {
//				 	out.println("<font color=red size=18> Login faile!!<br>");
//				 	out.println("<a href=login.jsp> Try Again!!</a>");
//			 }

			
//		} catch (ClassNotFoundException e) {
//			
//			//e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
	
		try {
			Class.forName("com.Mysql.cj.jdbc.Driver");
			ConnectionImpl con=(ConnectionImpl) DriverManager.getConnection("jdbc:mysql://localhost:3306/jay","root","JAYESH787428@#");
			

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
