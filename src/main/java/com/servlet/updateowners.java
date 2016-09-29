package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.OwnerDAO;
import com.DTO.Ownerdto;

/**
 * Servlet implementation class updateowners
 */
public class updateowners extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
	 String id=request.getParameter("id");
	 HttpSession session=request.getSession();
	 session.setAttribute("idvalue", id);
		OwnerDAO ds=new OwnerDAO();
		Ownerdto ud = ds.insertowner(0);  
		pw.println("<form action='UpdateOwner' method='get'>id:<input type='text' name='id' value="+ud.getId()+" required><br/>fname:<input type='text' name='fname' value="+ud.getFname()+" required><br/><br/>lname:<input type='text' name='lname' value="+ud.getLname()+" required><br/><br/>address:<input type='text' name='adrs' required></br><br/>city:<input type='text' name='city' required><br/><br/>telephone:<input type='text' name='tele' required><br/></br><input type='submit' value='update owner'></form>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
