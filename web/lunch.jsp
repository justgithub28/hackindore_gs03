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
            PreparedStatement st=con.prepareStatement("select * from required  where Type=? and UserId=?");
            String u=(String)request.getSession().getAttribute("user");
            st.setString(1,"Lunch");
            st.setString(2,u);
            ResultSet  rs=st.executeQuery();
            if((rs.next()))
 {
      response.sendRedirect("lunchcss.jsp");   
 
  }
 else
 {
     
     st=con.prepareStatement("insert into required values(?,?)");
st.setString(1,"Lunch");
st.setString(2,u);
st.executeUpdate();
 response.sendRedirect("lunchcss.jsp"); 
 }
      
 
%>
