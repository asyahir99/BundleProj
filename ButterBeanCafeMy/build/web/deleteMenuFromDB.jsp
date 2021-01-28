<%-- 
    Document   : deleteMenuById
    Created on : Jan 19, 2021, 10:40:28 PM
    Author     : User
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete menu by ID</h1>
        <form action="MenuDeleteById">
            <input type="text" name="id">
            <input type="submit" value="Search and Delete This Menu">
        </form>
    </body>
</html>