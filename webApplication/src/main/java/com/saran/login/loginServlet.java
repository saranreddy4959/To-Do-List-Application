package com.saran.login;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sarantodo.TodoService;


@WebServlet(urlPatterns = "/login.do")
public class loginServlet extends HttpServlet {
	
	private LoginService userValidationservice = new LoginService();
	private TodoService toDoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		
	
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		
		String name = request.getParameter("name");
		//System.out.println(name);
		String password = request.getParameter("pass");
		
		boolean userIsValid=userValidationservice.isUserValid(name,password);
		
		if(userIsValid) {
		request.getSession().setAttribute("name",name);
		response.sendRedirect("/list-todos.do");
		//todo Servlet
		
		
	}
		else {
			request.setAttribute("errorMessage", "Invalid Credentials");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
		}

}
}