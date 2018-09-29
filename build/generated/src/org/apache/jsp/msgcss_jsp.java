package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class msgcss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- saved from url=(0050)http://getbootstrap.com/docs/4.1/examples/sign-in/ -->\n");
      out.write("<html lang=\"en\"><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("    <title>Signin Template for Bootstrap</title>\n");
      out.write(" ");

        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"./msg_files/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"./msg_files/signin.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"text-center\">\n");
      out.write("       ");
 
              String u=(String)request.getSession().getAttribute("user");
          
              
      out.write("\n");
      out.write("              \n");
      out.write("              ");

                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              
      out.write("\n");
      out.write("    <form class=\"form-signin\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\">\n");
      out.write("      <h1 class=\"h3 mb-2 mt-2 font-weight-normal\">NOTICE</h1>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-8\"></div>\n");
      out.write("  </div>\n");
      out.write("      <br>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-6\">\n");
      out.write("      <textarea name=\"message\" rows=\"8\" cols=\"40\"     display: block;\n");
      out.write("    margin-left: auto;\n");
      out.write("    margin-right: auto;>\n");
      out.write("       </textarea>\n");
      out.write("     </div>\n");
      out.write("     <div class=\"col-sm-6\"></div>\n");
      out.write("   </div>\n");
      out.write("       <br>\n");
      out.write("       <br>\n");
      out.write("       <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-7\"></div>\n");
      out.write("          <div class=\"col-sm-5\">\n");
      out.write("      <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Submit</button>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      </form>\n");
      out.write("  \n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">function d_log (s) {\n");
      out.write("                var ev = document.createEvent('events');\n");
      out.write("                ev.initEvent('heartbeat_log', true, false);\n");
      out.write("                document.body.setAttribute('heartbeat_attrib', s);\n");
      out.write("                document.dispatchEvent(ev);\n");
      out.write("            };</script><div id=\"heartbeat_msg_wrap\"></div></body><button id=\"javascript-popup-blocker-notify\" style=\"display: none;\"></button></html>");
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
