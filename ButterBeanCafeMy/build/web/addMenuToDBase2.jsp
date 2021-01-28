<%-- 
    Document   : addMenuToDBase2
    Created on : Jan 19, 2021, 9:36:38 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Menu</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">    
        <style>
body {
  background-image: url('images/butterbeanscafe.jpg') ;
  background-repeat: no-repeat;
  background-size: 90% 90%;
  opacity: 0.9;
}
.cont{
    border-radius: 5px;
  background-color: #333;
  padding: 50px;
}

label,h1,p{
    color: white;
}
</style>
    </head>

    <body>
        <div class="container cont">
            <h1>ButterBeansCafe: Add Menu (To DBase)</h1>
       <form width="70%" action="MenuAdd">
            <div class="col-lg-4">
            <div class="form-group">
                <label for="id">Menu ID : </label><input class="form-control" type="number" name="id" placeholder="Menu ID" size="5"><br>
        </div>
        <div class="form-group>">
                <label for="menu">Menu Name : </label><input class="form-control" type="text" name="menu" placeholder="menu name"><br>
        </div>
        <div class="form-group>">
                <label for="price">Price : </label><input class="form-control" type="text" name="price" placeholder="menu price"><br>
        </div>
        <div class="form-group>">
                <label for="quantity">Quantity Available : </label><input class="form-control" type="text" name="quantity" placeholder="quantity available"><br>
        </div>
                <input class="btn btn-success" type="submit" value="Add This Menu to database">
        </div>
        </form>
        </div>
               
    </body>
</html>
