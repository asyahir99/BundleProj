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
        <title>Menu Today (from database)</title>
    </head>

    <body>
        <h1>ButterBeansCafe: Special Menu Today (From DBase)</h1>
        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/butterbeanscafe", "root", "");
                String sql = "SELECT * FROM MENU";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    out.print("<br><p> id : " + rs.getInt("id"));
                    out.print("<br><p> name : " + rs.getString("menu"));
                    out.print("<br><p> price : " + rs.getDouble("price"));
                    out.print("<br><p> stock avail : " + rs.getInt("quantity"));
                }
            } catch (Exception ex) {
                ex.printStackTrace();   
            }

        %>
    </body>
</html>
