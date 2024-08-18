package sumoftwonumber;

import java.io.IOException;

import org.apache.jasper.tagplugins.jstl.core.Out;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class jay  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String number1 = req.getParameter("number1");
		
		String number2 = req.getParameter("number2");
		
		String sum  = number1 + number2;
		
		System.out.println(sum);
		
		
		
		
	}
	
	

}
