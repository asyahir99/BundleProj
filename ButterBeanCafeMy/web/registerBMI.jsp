<html>
    <head>
        <title>Client Registration </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">    
        <style>
body {
  background-image: url('images/stay_healthy.jpg') ;
  background-repeat: no-repeat;
  background-size: 90% 90%;
  opacity: 0.9;
}
.cont{
    border-radius: 5px;
  background-color: #333;
  padding: 50px;
}

label,h1{
    color: white;
}
</style>

    </head>
    <body>
        <div class="container cont">
            <h1>Client Registration </h1>
        <!--<form width="70%" action="Result.jsp">-->
        <form width="70%" action="ProcessRegBMI">
            <div class="col-lg-4">
            <div class="form-group">
                <label for="username">Fullname : </label><input class="form-control" type="text" name="username" placeholder="Your Fullname" size="30"><br>
        </div>
        <div class="form-group>">
                <label for="yob">Year of Birth : </label><input class="form-control" type="text" name="yob" placeholder="yyyy"><br>
        </div>
        <div class="form-group>">
                <label for="weight">Your Weight (in KG) : </label><input class="form-control" type="text" name="weight" placeholder="weight (kg)"><br>
        </div>
        <div class="form-group>">
                <label for="height">Your Height (in Meter) : </label><input class="form-control" type="text" name="height" placeholder="height (meter)"><br>
        </div>
                <input class="btn btn-success" type="submit" value="Calculate BMI & Category">
        </div>
        </form>
    </div>
    </body>
</html>
