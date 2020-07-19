package com.hcl.servletdemo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateDepartment
 */
@WebServlet("/CreateDepartment")
public class CreateDepartment extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
      int deptID=Integer.parseInt(request.getParameter("deptID"));
      String deptName=request.getParameter("deptName");
      Depart depart=new Depart(deptID,deptName);
      DepartService.createDepartment(depart);
      
      response.sendRedirect("database.jsp");
	}

}
