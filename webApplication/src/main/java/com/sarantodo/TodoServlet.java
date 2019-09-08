package com.sarantodo;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sarantodo.TodoService;


@WebServlet(urlPatterns = "/list-todos.do")
public class TodoServlet extends HttpServlet {
	

	private TodoService toDoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		request.setAttribute("todos", toDoService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/list-todos.jsp").forward(request,response);
		
	
	}
	
}
