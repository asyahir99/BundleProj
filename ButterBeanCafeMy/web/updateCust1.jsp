<%-- 
    Document   : updateCust1
    Created on : Jan 21, 2021, 3:53:54 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action = "updateCust2">
            <input name="id" type="text" placeholder="id" required/>
            <input name="name" type="text" placeholder="name" required/>
            <input name="yob" type="text" placeholder="yob" required/>
            <input name="height" type="text" placeholder="height" required/>
            <input name="weight" type="text" placeholder="weight" required/>
            <input type="submit" value="SUBMIT"  />
        </form>
    </body>
</html>
