package tp3;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/maServlet")
public class UneServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
									throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println ("<h1><center>Servlet.class</center></h1>");
      out.println ("<hr>");
      String s = "Hello !";
      for (int i = 0; i < s.length()-1; i++) {
      	out.println ("<center>"+s+"</center>");
      	s = s.substring(1,s.length()-2);
      }
   }
   
}
