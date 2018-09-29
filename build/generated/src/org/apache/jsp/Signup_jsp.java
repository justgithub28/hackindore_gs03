package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public final class Signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

     String name= request.getParameter("Name");
         String pass= request.getParameter("pwd");
         String id= request.getParameter("LogIn");
         String pass_conf= request.getParameter("pwd_confirm");
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
            PreparedStatement st=con.prepareStatement("select * from student where LoginId=? ");
             st.setString(1,id);
                ResultSet  rs=st.executeQuery();
                if((rs.next()))
            {
            
                 out.println("<meta http-equiv='refresh' content='1;URL=Signupcss.jsp'>");//redirects after 3 seconds
                 out.println("<p style='color:red;'>Enrollment number already registered</p>");
            }
                else if(pass.equals(pass_conf))
      
        {     

st=con.prepareStatement("insert into student values(?,?,?)");
st.setString(1,name);
st.setString(2,id);
st.setString(3,pass);
st.executeUpdate();

  response.sendRedirect("LogIncss.jsp");
         }
     

        else{
         out.println("<meta http-equiv='refresh' content='1;URL=Signupcss.jsp'>");//redirects after 3 seconds
   out.println("<p style='color:red;'>Password do not match with confirm password</p>");
         
        }
 

      out.write('\n');
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
