/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Menu;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "MenuController1", urlPatterns = {"/MenuController1"})
public class MenuController1 extends HttpServlet {

    private Connection conn = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    List<Menu> menuList = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //we can refactor the code here into DAO & DBUtil packages, later
        try {
            //step 1: load driver
            Class.forName("com.mysql.jdbc.Driver");
            //out.print("connect to database");
            //get the connection object
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/butterbeanscafe", "root", "");
            //out.println("connected :" +conn);
            //prepare the statement object
            stmt = conn.createStatement();
            //prepare the sql select
            String sql = "SELECT * FROM MENU";
            //execute the sql
            rs = stmt.executeQuery(sql);
            menuList = new ArrayList();

            while (rs.next()) {
                //add this record into beans object, menu
                Menu m = new Menu(rs.getInt("id"), 
                                    rs.getString("menu"), 
                                    rs.getDouble("price"), 
                                    rs.getInt("quantity"));
                menuList.add(m);
            }
            conn.close();
        } catch (Exception ex) {}
        request.getSession().setAttribute("menuList", menuList);
//        request.getRequestDispatcher("GetAllMenu.jsp").forward(request, response);
        response.sendRedirect("GetAllMenu.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
