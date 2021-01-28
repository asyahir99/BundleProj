<%-- 
    Document   : getAllCustomer.jsp
    Created on : Jan 21, 2021, 5:03:36 PM
    Author     : ahmad
--%>

<%@page import="Model.CustomerBean"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%  List<CustomerBean> cust;
            CustomerDaoImpl dao = new CustomerDaoImpl();
            cust = dao.getCustomerAll();
            for(int i = 0;i < cust.size();i++){
                out.print("<br><p> name : " + (cust.get(i)).getName());
                out.print("<br><p> yob : " + (cust.get(i)).getYob());
                out.print("<br><p> height : " + (cust.get(i)).getHeight());
                out.print("<br><p> weigth : " + (cust.get(i)).getWeight());
            }
        %>
    </body>
</html>
