package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String username=request.getParameter("uname");
	 String password=request.getParameter("upass");
	 
	 LoginDTO dto=new LoginDTO();
	 dto.setUsername(username);
	 dto.setPassword(password);
	 
	 LoginDAO dao=new LoginDAO();
	 if(dao.validate(dto)) {
		 response.sendRedirect("loginsuccess.jsp");
	 }
	 else {
		 response.sendRedirect("default.jsp");
	 }
	
	}

}
