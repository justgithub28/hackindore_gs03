package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.util.ArrayList;

public final class interestedcss_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Notifications</title>\r\n");
      out.write("     ");

        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"bg-light\" style=\"background-color: \">\r\n");
      out.write("  ");
 
              String u=(String)request.getSession().getAttribute("user");
          
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              ");

                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write(" <button class=\"btn btn-lg btn-primary \" onclick=\"location.href='studentcss.jsp';\" type=\"submit\">Back</button>\r\n");
      out.write("         <button class=\"btn btn-lg btn-primary \"  type=\"button\">Intrested Ones</button>\r\n");
      out.write("         <button class=\"btn btn-lg btn-primary \" onclick=\"location.href='LogIncss.jsp';\" type=\"submit\">Logout</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"jumbotron jumbotron-fluid\"  style=\"height: 100%;\"    >\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("        <form>\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("             <div class=\"col-md-12\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("    \r\n");
      out.write("     ");

                    
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
                PreparedStatement st=con.prepareStatement("select count(Type) from required where Type='Breakfast' ");
               ResultSet rs=st.executeQuery();
          
      out.write("\r\n");
      out.write("          <table>\r\n");
      out.write("            <tr align=\"center\">\r\n");
      out.write("               \r\n");
      out.write("                <textarea class=\"form-control\" id=\"message\" rows=\"3\">");
 String Countrow="";
                    while(rs.next()){
Countrow = rs.getString(1);
out.println("Total Students for Breakfast:" +Countrow); 
      out.write("</textarea>\r\n");
      out.write("                \r\n");
      out.write("             </tr>\r\n");
      out.write("          ");
  }
            
      out.write("\r\n");
      out.write("        ");

                    
                 Class.forName("com.mysql.jdbc.Driver");
                
                st=con.prepareStatement("select count(Type) from required where Type='Lunch' ");
             rs=st.executeQuery();
          
      out.write("\r\n");
      out.write("          <table>\r\n");
      out.write("            <tr align=\"center\">\r\n");
      out.write("               \r\n");
      out.write("                <textarea class=\"form-control\" id=\"message\" rows=\"3\">");
  Countrow="";
                    while(rs.next()){
Countrow = rs.getString(1);
out.println("Total Students for Lunch:" +Countrow); 
      out.write("</textarea>\r\n");
      out.write("                \r\n");
      out.write("             </tr>\r\n");
      out.write("          ");
  }
            
      out.write("\r\n");
      out.write("     ");

                    
                 Class.forName("com.mysql.jdbc.Driver");
                
            st=con.prepareStatement("select count(Type) from required where Type='Dinner' ");
               rs=st.executeQuery();
          
      out.write("\r\n");
      out.write("          <table>\r\n");
      out.write("            <tr align=\"center\">\r\n");
      out.write("               \r\n");
      out.write("                <textarea class=\"form-control\" id=\"message\" rows=\"3\">");
  Countrow="";
                    while(rs.next()){
Countrow = rs.getString(1);
out.println("Total Students for Dinner:" +Countrow); 
      out.write("</textarea>\r\n");
      out.write("                \r\n");
      out.write("             </tr>\r\n");
      out.write("          ");
  }
            
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("             </div>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
