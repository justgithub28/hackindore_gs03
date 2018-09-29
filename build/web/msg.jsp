<%-- 
    Document   : Signup
    Created on : 28 Sep, 2018, 6:24:34 PM
    Author     : Tanu
--%>
<%@page import="java.sql.DriverManager,java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement,java.sql.ResultSet" %>
<%@page import="javax.swing.JOptionPane" %>

<%
      
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
             String s = new String(request.getParameter("message"));
     
    PreparedStatement  st=con.prepareStatement("insert into notify values(?)");
st.setString(1,s);
st.executeUpdate();
 response.sendRedirect("admincss.jsp"); 
  
 
%>
