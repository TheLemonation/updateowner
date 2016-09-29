package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.ownerservice;
public class addowner extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id= request.getParameter("id"); 
        String fname = request.getParameter("fname"); 
        String lname = request.getParameter("lname"); 
        String address = request.getParameter("adrs"); 
        String city = request.getParameter("city");
        String telephone = request.getParameter("tele");
        ownerservice owner=new ownerservice();
        int i=owner.addOwner(id,fname,lname,address,city,telephone);
        PrintWriter out= response.getWriter();
	if(i==0){
		RequestDispatcher requestDispatcher; 
		requestDispatcher = request.getRequestDispatcher("/showlist.jsp");
		requestDispatcher.forward(request, response);
	}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
