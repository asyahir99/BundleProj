package Controller;

import Model.ClientBMIBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ProcessBMIServlet", urlPatterns = {"/ProcessRegisterBMI"})
public class ProcessBMIServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //instantiate/create a bean object
        //and set the bean properties
        ClientBMIBean client = new ClientBMIBean();
        client.setName(request.getParameter("username"));
        client.setYob(Integer.parseInt(request.getParameter("yob")));
        client.setWeight(Double.parseDouble(request.getParameter("weight")));
        client.setHeight(Double.parseDouble(request.getParameter("height")));
        client.calculateAll();
        
//        add this bean object (client) as an application scope object
//        ServletContext s = request.getServletContext();  //.getSession();
        request.setAttribute("client", client);
        RequestDispatcher rd = request.getRequestDispatcher("Result_1.jsp");
        rd.forward(request, response);
//        response.sendRedirect("Result_1.jsp");
        
        
        
        
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
