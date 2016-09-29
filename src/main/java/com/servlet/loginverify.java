package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class loginverify extends HttpServlet {
		
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html"); 
		String username=request.getParameter("username");
		String password=request.getParameter("psd");
		if(username.equals("harsha")&&password.equals("1234")){
                 pw.println("<form action='add' method='get'><input type='submit' value='addowner'></form>");
                 pw.println("<form action='update' method='get'><input type='submit' value='updateowner'></form>");
		}
                else{
                 pw.println("Login Failed...!");
		 pw.close();
		}
	}
 
}
	