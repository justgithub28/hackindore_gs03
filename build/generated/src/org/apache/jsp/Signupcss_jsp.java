package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Signupcss_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\"/>\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\"/>\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Site Properties -->\r\n");
      out.write("    <title>Registration form</title>\r\n");
      out.write("   ");

        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Stylesheets -->\r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     ");
 
              String u=(String)request.getSession().getAttribute("user");
          
              
      out.write("\r\n");
      out.write("              \r\n");
      out.write("              ");

                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              
      out.write("\r\n");
      out.write("<div class=\"container\" style=\"margin-top: 10%\">\r\n");
      out.write("    <form class=\"form-horizontal\" role=\"form\" method=\"POST\" action=\"Signup.jsp\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3\"></div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <h2>Register New User</h2>\r\n");
      out.write("                <hr>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 field-label-responsive\">\r\n");
      out.write("                <label for=\"name\">Name</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\">\r\n");
      out.write("                        <div class=\"input-group-addon\" style=\"width: 2.6rem\"><i class=\"fa fa-user\"></i></div>\r\n");
      out.write("                        <input type=\"text\" name=\"Name\" class=\"form-control\" id=\"name\"\r\n");
      out.write("                               placeholder=\"Gautam Patidar\" required autofocus>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <div class=\"form-control-feedback\">\r\n");
      out.write("                        <span class=\"text-danger align-middle\">\r\n");
      out.write("                            <!-- Put name validation error messages here -->\r\n");
      out.write("                        </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 field-label-responsive\">\r\n");
      out.write("                <label for=\"enroll\">Enrollment No</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\">\r\n");
      out.write("                        <div class=\"input-group-addon\" style=\"width: 2.6rem\"><i class=\"fa fa-at\"></i></div>\r\n");
      out.write("                        <input type=\"text\" name=\"LogIn\" class=\"form-control\" id=\"enroll\"\r\n");
      out.write("                               placeholder=\"0801IT161028\" required autofocus>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <div class=\"form-control-feedback\">\r\n");
      out.write("                        <span class=\"text-danger align-middle\">\r\n");
      out.write("                            <!-- Put e-mail validation error messages here -->\r\n");
      out.write("                        </span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 field-label-responsive\">\r\n");
      out.write("                <label for=\"password\">Password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"form-group has-danger\">\r\n");
      out.write("                    <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\">\r\n");
      out.write("                        <div class=\"input-group-addon\" style=\"width: 2.6rem\"><i class=\"fa fa-key\"></i></div>\r\n");
      out.write("                        <input type=\"password\" name=\"pwd\" class=\"form-control\" id=\"password\"\r\n");
      out.write("                               placeholder=\"Password\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("             <!--   <div class=\"form-control-feedback\">\r\n");
      out.write("                        <span class=\"text-danger align-middle\">\r\n");
      out.write("                            <i class=\"fa fa-close\"> Example Error Message</i>\r\n");
      out.write("                        </span>\r\n");
      out.write("                </div>\r\n");
      out.write("                -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3 field-label-responsive\">\r\n");
      out.write("                <label for=\"password\">Confirm Password</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-6\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"input-group mb-2 mr-sm-2 mb-sm-0\">\r\n");
      out.write("                        <div class=\"input-group-addon\" style=\"width: 2.6rem\">\r\n");
      out.write("                            <i class=\"fa fa-repeat\"></i>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <input type=\"password\" name=\"pwd_confirm\" class=\"form-control\"\r\n");
      out.write("                               id=\"password-confirm\" placeholder=\"Password\" required>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-md-3\"></div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-lg btn-primary\"> Register</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-md-4\">\r\n");
      out.write("                <button type=\"submit\"  onclick=\"location.href='LogIncss.jsp';\" class=\"btn btn-lg btn-primary\"> Login</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </form>\r\n");
      out.write("</div>\r\n");
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
