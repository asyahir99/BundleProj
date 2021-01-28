package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class GetAllMenuFromDbase_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


            private static final String connectionURL = "jdbc:mysql://localhost:3306/butterbeanscafe";
            private static final String driver = "com.mysql.jdbc.Driver";
            private static final String username = "root";
            private static final String password = "";
            private static Connection conn = null;

            private Statement stmt = null;
            private ResultSet rs = null;
        
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">    \n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  background-image: url('images/butterbeanscafe.jpg') ;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: 90% 90%;\n");
      out.write("  opacity: 0.9;\n");
      out.write("}\n");
      out.write(".cont{\n");
      out.write("    border-radius: 5px;\n");
      out.write("  background-color: #333;\n");
      out.write("  padding: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("label,h1,p{\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"container cont\">\n");
      out.write("            <h1>ButterBeansCafe: Special Menu Today (From DBase)</h1>\n");
      out.write("            <form class=\"form-horizontal\" width=\"70%\" action=\"ProcessOrder\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    ");

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

                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
