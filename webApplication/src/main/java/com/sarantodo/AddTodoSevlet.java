package com.sarantodo;




import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.sarantodo.TodoService;


@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoSevlet extends HttpServlet {
	

	private TodoService toDoService = new TodoService();
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request,response);
		
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException,IOException{
		request.setAttribute("todos", toDoService.retriveTodos());
		String newTodo = request.getParameter("todo");
		String category = request.getParameter("category");
		toDoService.addTodo(new Todo(newTodo,category));
		response.sendRedirect("/list-todos.do");
		
	}
}
