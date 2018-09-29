package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menucss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Menu</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body class=\"bg-light\">\r\n");
      out.write("      ");
 
              if(session==null)
              {
                  
                response.sendRedirect("LogIncss.jsp");
              }
              
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"py-5 text-center\"\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <div class=\"row\">\r\n");
      out.write("       <h2><b>Menu</b></h2>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-md-12 \">\r\n");
      out.write("          <form class=\"needs-validation\" novalidate=\"\" action=\"menu.jsp\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-md-3\">\r\n");
      out.write("                <select class=\"form-control\" name=\"shift\">\r\n");
      out.write("                  <option>Lunch</option>\r\n");
      out.write("                  <option>Dinner</option>\r\n");
      out.write("                  <option>Breakfast</option>\r\n");
      out.write("                </select>\r\n");
      out.write("                 </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish1\">Dish 1</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish1\" placeholder=\"\" value=\"\">\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Atleast one dish is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish2\">Dish 2</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish2\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish3\">Dish 3</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish3\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish4\">Dish 4</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish4\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish5\">Dish 5</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish5\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish6\">Dish 6</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish6\" placeholder=\"\" value=\"\">\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                 <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish1\">Dish 7</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish7\" placeholder=\"\" value=\"\">\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid first name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish2\">Dish 8</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish8\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish3\">Dish 9</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish9\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                <label for=\"dish4\">Dish 10</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"dish10\" placeholder=\"\" value=\"\" >\r\n");
      out.write("                <div class=\"invalid-feedback\">\r\n");
      out.write("                  Valid last name is required.\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-4\"></div>\r\n");
      out.write("              <div class=\"col-md-3\">\r\n");
      out.write("                 <button class=\"btn btn-primary btn-lg btn-block\" type=\"submit\">Submit</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script>\r\n");
      out.write("      // Example starter JavaScript for disabling form submissions if there are invalid fields\r\n");
      out.write("      (function() {\r\n");
      out.write("        'use strict';\r\n");
      out.write("\r\n");
      out.write("        window.addEventListener('load', function() {\r\n");
      out.write("          // Fetch all the forms we want to apply custom Bootstrap validation styles to\r\n");
      out.write("          var forms = document.getElementsByClassName('needs-validation');\r\n");
      out.write("\r\n");
      out.write("          // Loop over them and prevent submission\r\n");
      out.write("          var validation = Array.prototype.filter.call(forms, function(form) {\r\n");
      out.write("            form.addEventListener('submit', function(event) {\r\n");
      out.write("              if (form.checkValidity() === false) {\r\n");
      out.write("                event.preventDefault();\r\n");
      out.write("                event.stopPropagation();\r\n");
      out.write("              }\r\n");
      out.write("              form.classList.add('was-validated');\r\n");
      out.write("            }, false);\r\n");
      out.write("          });\r\n");
      out.write("        }, false);\r\n");
      out.write("      })();\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
