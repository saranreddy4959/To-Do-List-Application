package com.saran.logout;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sarantodo.TodoService;


@WebServlet(urlPatterns = "/logout.do")
public class LogoutServlet extends HttpServlet {
	
	private TodoService toDoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		request.getSession().invalidate();
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		
	
	}
}