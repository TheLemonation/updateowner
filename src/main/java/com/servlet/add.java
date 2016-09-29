package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws  ServletException, IOException {
	    
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
        
		pw.println("<form action='addowner' method='get'>id:<input type='text' name='id' required><br/>fname:<input type='text' name='fname' required><br/><br/>lname:<input type='text' name='lname' required><br/><br/>address:<input type='text' name='adrs' required></br><br/>city:<input type='text' name='city' required><br/><br/>telephone:<input type='text' name='tele' required><br/></br><input type='submit' value='addowner'></form>");
	
	}

}
