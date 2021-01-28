<%-- 
    Document   : deleteCustomerByID
    Created on : Jan 21, 2021, 3:34:28 PM
    Author     : akmal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete menu by ID</h1>
        <form action="CustomerDelete">
            <input type="text" name="id">
            <input type="submit" value="Search and Delete This Customer">
        </form>
    </body>
</html>
