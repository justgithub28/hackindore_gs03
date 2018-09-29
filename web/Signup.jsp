<%-- 
    Document   : Signup
    Created on : 28 Sep, 2018, 6:24:34 PM
    Author     : Tanu
--%>
<%@page import="java.sql.DriverManager,java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement,java.sql.ResultSet" %>
<%@page import="javax.swing.JOptionPane" %>

<%
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
 
%>
