package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class login extends HttpServlet 
{
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
	PrintWriter pw=response.getWriter();
	
	pw.println(  "<form action='loginverify' method='get'>Username:<input type='text' name='username' required><br/><br/>Password:<input type='password'name='psd' required><br/><br/><input type='submit' value='login'></form>");

	}
	}
	