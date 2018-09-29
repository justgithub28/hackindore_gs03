package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;

public final class breakfastcss_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Student Menu</title>\n");
      out.write("    ");

        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"bg-light\">\n");
      out.write("      <nav class=\"navbar navbar-light bg-light\">\n");
      out.write("          ");
 
              String u=(String)request.getSession().getAttribute("user");
          
              
      out.write("\n");
      out.write("              \n");
      out.write("              ");

                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              
      out.write("\n");
      out.write("              <button class=\"btn btn-lg btn-primary \" type=\"submit\" onclick=\"location.href('LogIncss.html');\">Home</button>\n");
      out.write("  <form method=\"post\" action=\"LogOut.jsp\">\n");
      out.write("         <button class=\"btn btn-lg btn-primary \" type=\"submit\">Logout</button>\n");
      out.write("  </form>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <div class=\"py-5 text-center\"\n");
      out.write("\n");
      out.write("\n");
      out.write("     <div class=\"row\">\n");
      out.write("       <h2><b>Student Menu</b></h2>\n");
      out.write("     \n");
      out.write("  \n");
      out.write("             \n");
      out.write("                ");

                     ArrayList list1=new ArrayList();
                     ArrayList list2=new ArrayList();
                     ArrayList list3=new ArrayList();
                     ArrayList list4=new ArrayList();
                     ArrayList list5=new ArrayList();
                     ArrayList list6=new ArrayList();
                     ArrayList list7=new ArrayList();
                     ArrayList list8=new ArrayList();
                     ArrayList list9=new ArrayList();
                     ArrayList list10=new ArrayList();
                     ArrayList list11=new ArrayList();
                     
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
                PreparedStatement st=con.prepareStatement("select * from menu where Shift='Breakfast'");
               ResultSet rs=st.executeQuery();
           while(rs.next())
        {
            list1.add(rs.getString(1));
            list2.add(rs.getString(2));
            list3.add(rs.getString(3));
            list4.add(rs.getString(4));
            list5.add(rs.getString(5));
            list6.add(rs.getString(6));
            list7.add(rs.getString(7));
            list8.add(rs.getString(8));
            list9.add(rs.getString(9));
            list10.add(rs.getString(10));
            list11.add(rs.getString(11));
          
        }
           int i=0;
           
      out.write("\n");
      out.write("          \n");
      out.write("           <button class=\"btn btn-lg btn-primary \" type=\"submit\" >");
      out.print(list1.get(i));
      out.write("</button>\n");
      out.write("     \n");
      out.write("              <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 1</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list2.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 2</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list3.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 3</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list4.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 4</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list5.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 5</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list6.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                    <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 6</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list7.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("            <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 7</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list8.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 8</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list9.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish 9</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list10.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                <label for=\"dish3\">Dish </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"");
      out.print(list11.get(i) );
      out.write("\" value=\"\" disabled=\"\" >\n");
      out.write("                <div class=\"invalid-feedback\">\n");
      out.write("                  Valid last name is required.\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-md-4\"></div>\n");
      out.write("              <div class=\"col-md-3\">\n");
      out.write("                  <div class=\"form-group form-check\">\n");
      out.write("                                 \n");
      out.write("                    \n");
      out.write("                                   \n");
      out.write("                    <button class=\"btn btn-primary  btn-block\" type=\"submit\" onclick=\"location.href='breakfast.jsp'\">Interested</button>\n");
      out.write("                    <button class=\"btn btn-primary  btn-block\" type=\"submit\" onclick=\"location.href='breakfastcss.jsp'\">Back</button>\n");
      out.write("                 \n");
      out.write("                       </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write(" \n");
      out.write("        </div>\n");
      out.write("      \n");
      out.write("    \n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
