<%-- 
    Document   : GetAllMenuFromDbase
    Created on : Jan 6, 2021, 8:59:50 PM
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
        <%!
            private static final String connectionURL = "jdbc:mysql://localhost:3306/butterbeanscafe";
            private static final String driver = "com.mysql.jdbc.Driver";
            private static final String username = "root";
            private static final String password = "";
            private static Connection conn = null;

            private Statement stmt = null;
            private ResultSet rs = null;
        %>
        <div class="container cont">
            <h1>ButterBeansCafe: Special Menu Today (From DBase)</h1>
            <form class="form-horizontal" width="70%" action="ProcessOrder">
                <div class="col-lg-4">
                    <%
                        try {
                            Class.forName(driver);
                            conn = DriverManager.getConnection(connectionURL, username, password);
                            String sql = "SELECT * FROM MENU";
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery(sql);

                            while (rs.next()) {
                                out.print("<br><p> id : " + rs.getInt("id"));
                                out.print("<br><p> name : " + rs.getString("menu"));
                                out.print("<br><p> price : " + rs.getDouble("price"));
                                out.print("<br><p> stock avail : " + rs.getInt("quantity"));
                                out.print("<br><p> img : " + rs.getBlob("img"));
                            }
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }

                    %>
                </div>
            </form>
        </div>
    </body>
</html>
