import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FourMul extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("mul1"));
		int j = Integer.parseInt(req.getParameter("mul2"));
		
		int k = i * j;
		
		PrintWriter out = res.getWriter();
		out.println("Multiplication is : " + k);
	}
}
