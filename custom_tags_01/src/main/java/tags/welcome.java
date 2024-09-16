package tags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class welcome extends TagSupport{

	@Override
	public int doStartTag() throws JspException {
		
		try {
			
				JspWriter out=pageContext.getOut();
				
				out.print("<h1>Good moring</h1><br><h4> welcome to the custom tag of jayesh</h4>");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
