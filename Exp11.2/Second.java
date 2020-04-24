import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		String title = "Current Date and Time";
		Date date = new Date();
		String d = date.toString();
		
		String n = req.getParameter("yourname");
		
		out.println("Hello " + n);
		out.println(title);
		out.println(d);
	}
}
