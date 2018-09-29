<%-- 
    Document   : Signup
    Created on : 28 Sep, 2018, 6:24:34 PM
    Author     : Tanu
--%>
<%@page import="java.sql.DriverManager,java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement,java.sql.ResultSet" %>
<%@page import="javax.swing.JOptionPane" %>

<%
     String select[] = request.getParameterValues("Interested"); 
                if (select != null && select.length != 0)
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
 
%>
