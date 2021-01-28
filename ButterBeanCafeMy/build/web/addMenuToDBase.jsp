<%-- 
    Document   : addMenuToDBase
    Created on : Jan 19, 2021, 8:46:30 PM
    Author     : User
--%>

<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add menu!</h1>
                <%!
            private static final String connectionURL = "jdbc:mysql://localhost:3306/butterbeanscafe";
            private static final String driver = "com.mysql.jdbc.Driver";
            private static final String username = "root";
            private static final String password = "";
            private static Connection conn = null;

            private Statement stmt = null;
        %>
        <div class="container cont">
            <h1>ButterBeansCafe: Add Menu (To DBase)</h1>
                    <%
                        try {
                            Class.forName(driver);
                            conn = DriverManager.getConnection(connectionURL, username, password);
                            String query = "INSERT INTO MENU (id,menu,price,quantity) VALUES (?,?,?,?)";
                            PreparedStatement pstmt = conn.prepareStatement(query);
                            pstmt.setInt(1, 111);
                            pstmt.setString(2, "special ooo");
                            pstmt.setDouble(3, 22.5);
                            pstmt.setInt(4, 10);
                            pstmt.execute();
                        } catch (Exception ex) {
                            out.print("error");
                            ex.printStackTrace();
                        }
                    %>
        </div>
    </body>
</html>
