<%@page import="com.DTO.Ownerdto"%>
<%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
    <HEAD>
        <TITLE>List of Owners </TITLE>
    </HEAD>

    <BODY>
        <H1>List of Owners </H1>

      <% 
            Connection connection = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/petclinic", "root", "1234");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from owners") ; 
        %>

        <TABLE BORDER="1">
            <TR>
                <TH>ID</TH>
                <TH>First Name</TH>
                <TH>Last Name</TH>
                <TH>Address</TH>
                <TH>City</TH>
                <TH>Telephone</TH>
            </TR>
            <% while(resultset.next()){ %>
            <TR>
                <TD> <%= resultset.getString(1) %></td>
                <TD> <%= resultset.getString(2) %></TD>
                <TD> <%= resultset.getString(3) %></TD>
                <TD> <%= resultset.getString(4) %></TD>
                <TD> <%= resultset.getString(5) %></TD>
                <TD> <%= resultset.getString(6) %></TD>
            </TR>
            <% } %>
        </TABLE>
    </BODY>
</HTML>
