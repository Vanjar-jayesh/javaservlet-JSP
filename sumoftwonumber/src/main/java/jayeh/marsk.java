package jayeh;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class marsk extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		resp.setContentType("text/html");
		
		String name = req.getParameter("name");
		String roll = req.getParameter("Roll");
		int sub1 = Integer.parseInt(req.getParameter("sub1"));
		int sub2= Integer.parseInt(req.getParameter("sub2"));
		int sub3 = Integer.parseInt(req.getParameter("sub3"));
		
		int total = sub1 + sub2 + sub3;
		float aver = total/3.0f;
		
		String result = (sub1>=35 && sub2>=35 && sub3>=35) ? "pass":"fail";
		
		PrintWriter out = resp.getWriter();
		
		out.println("<html><body>");
		out.println("<h2>Student mark sheet</h2>");
		out.println("<p><strong>name:</strong>"+name+"</p>");
		out.println("<p><strong>Student Roll number:</strong>"+roll+"</p>");
		out.println("<p><strong>marks in sub1 : </strong>"+sub1+"</p>");
		out.println("<p><strong>marks in sub2 : </strong>"+sub2+"</p>");
		out.println("<p><strong>marks in sub3 : </strong>"+sub3+"</p>");
		
		out.println("<p><strong>Total marks : </strong>"+total+"</p>");
		out.println("<p><strong>aver: </strong>"+aver+"</p>");
		
		out.println("<p><strong>Result: </strong>"+result+"</p>");

		
		
	}

	
	
}
