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
        <<div class="container cont">
            <h1>Register @ButterBeans Cafe</h1>
        <form action="updateStock">
        <div class="col-lg-4">
        <div class="form-group">
                <label for="fullname">Fullname : </label><input class="form-control" type="text" name="fullname" placeholder="Fullname" size="30"><br>
        </div>
        <div class="form-group>">
                <label for="email">Email Address : </label><input class="form-control" type="text" name="email" placeholder="your email"><br>
        </div>
        <div class="form-group>">
                <label for="username">Select a username : </label><input class="form-control" type="text" name="username" placeholder="Username"><br>
        </div>
        <div class="form-group>">
            <label for="category">Select your Category : </label><select name = "category"><option value ="customer">Customer</option><option value="staff">Staff</option></select><br>
        </div>
        <div class="form-group>">
                <label for="password">Select your Password : </label><input class="form-control" type="password" name="password" placeholder="Password"><br>
        </div>
        <div class="form-group>">
                <label for="reenterPassword">Reenter Password : </label><input class="form-control" type="text" name="reenterPassword" placeholder="Reenter Password"><br>
        </div>
                <input class="btn btn-success" type="submit" value="Register and Login">
                <input class="btn btn-success" type="reset" value="Reset">
        </div>
        </form>
    </div>
    </body>
</html>
