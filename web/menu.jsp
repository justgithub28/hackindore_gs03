<%-- 
    Document   : Signup
    Created on : 28 Sep, 2018, 6:24:34 PM
    Author     : Tanu
--%>
<%@page import="java.sql.DriverManager,java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement,java.sql.ResultSet" %>
<%@page import="javax.swing.JOptionPane" %>

<%
     String shift= request.getParameter("shift");
         String dish1= request.getParameter("dish1");
        String dish2= request.getParameter("dish2");
        String dish3= request.getParameter("dish3");
        String dish4= request.getParameter("dish4");
        String dish5= request.getParameter("dish5");
        String dish6= request.getParameter("dish6");
        String dish7= request.getParameter("dish7");
        String dish8= request.getParameter("dish8");
        String dish9= request.getParameter("dish9");
        String dish10= request.getParameter("dish10");
        
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
            PreparedStatement st=con.prepareStatement("update menu set dish1=?,dish2=?,dish3=?,dish4=?,dish5=?,dish7=?,dish8=?,dish9=?,dish6=?,dish10=? where Shift=?");


st.setString(1,dish1);
st.setString(2,dish2);
st.setString(3,dish3);
st.setString(4,dish4);
st.setString(5,dish5);
st.setString(6,dish6);
st.setString(7,dish7);
st.setString(8,dish8);
st.setString(9,dish9);
st.setString(10,dish10); 
st.setString(11,shift);
st.executeUpdate();

       
         out.println("<meta http-equiv='refresh' content='1;URL=menucss.jsp'>");//redirects after 3 seconds
   out.println("<p style='color:red;'>Menu Updated Successfully</p>");
         
        
 
%>
