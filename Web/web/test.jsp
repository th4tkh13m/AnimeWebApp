<%-- 
    Document   : test
    Created on : Jun 21, 2022, 3:18:08 PM
    Author     : th4tkh13m
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="dbconnect.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% DBConnect db = new DBConnect(application.getInitParameter("driver"), application.getInitParameter("url"), application.getInitParameter("user"), application.getInitParameter("pass"));
            ResultSet res = db.getConnection().createStatement().executeQuery("SELECT TOP 5 * FROM Genre");
            while (res.next()) {                    
                    out.println(res.getInt(1) + " " + res.getString(2));
                }
        %>
    </body>
</html>
