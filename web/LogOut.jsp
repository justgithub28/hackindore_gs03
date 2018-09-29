<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
    
    request.getSession().setAttribute("user",null);
    
         
    out.println("<br/><b>You are successfully logged out........ ");
              
                out.println("<meta http-equiv='refresh' content='1;URL=LogIncss.jsp'>");
            
  
            
            
%>

