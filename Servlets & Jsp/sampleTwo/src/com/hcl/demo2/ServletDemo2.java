package com.hcl.demo2;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletDemo2
 */
@WebServlet(urlPatterns={"/ServletDemo2"},
initParams={@WebInitParam(name="defaultUser",value="satyasai")}
)
public class ServletDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDemo2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName=request.getParameter("userName");
		HttpSession session=request.getSession();
		ServletContext context=request.getServletContext();
		
		if(userName !="" && userName !=null) {
			session.setAttribute("SavedUserName",userName);
			context.setAttribute("SavedUserName", userName);
		}
		
		
		
		
		out.println("request parameter "+userName);
		out.println("session is"+(String)session.getAttribute("SavedUserName"));
		out.println("context is"+(String)context.getAttribute("SavedUserName"));
		out.println("default user is::"+getServletConfig().getInitParameter("defaultUser"));
	}



}
