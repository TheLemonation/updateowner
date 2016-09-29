package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.OwnerDAO;
import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Servlet implementation class update
 */
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		OwnerDAO ud=new OwnerDAO();
		ArrayList list = ud.Ownername();
		
		pw.println("<table><tr><th>ID</th><td>&nbsp</td><th>First Name</th><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><th>Last Name</th><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><th>Address</th><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><th>City</th><td>&nbsp</td><td>&nbsp</td><td>&nbsp</td><th>Telephone</th></tr>");
		int i=1;
		String s="";
		pw.println("<table>");
		for(Object x:list){
			if(i>=7)
			{
			pw.println("<tr>"+s+"</tr>");
			s="<td><a href='http://localhost:60/updateowner/updateowners?id= "+x+"'>"+ x+ "</a></td>";
			i=1;
			
			}
			else
			{
				if(i==1){
			s=s+"<td><a href='http://localhost:60/updateowner/updateowners"
					+ "?id="+x+"'>"+ x + "</a></td>";
				}else{
					s=s+"<td>"+x+"</td>";
				
			}

			}
		
		i++;
			
	}
		pw.println("</table>");
}
}
