<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane" %>

<%
    
    
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
    
         String id= request.getParameter("userId");
         String pass= request.getParameter("pwd");
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
          PreparedStatement st=con.prepareStatement("select * from student where LoginId=? and Password=?");
            st.setString(1,id);
            st.setString(2,pass);
            ResultSet  rs=st.executeQuery();
          if(rs.next())
            {
             request.getSession().setAttribute("user",id);
              response.sendRedirect("studentcss.jsp");             
            }
         else
          { 
                st=con.prepareStatement("select * from messadmin where LoginId=? and Password=?");
            st.setString(1,id);
            st.setString(2,pass);
            rs=st.executeQuery();  
             if(rs.next())
            {
                request.getSession().setAttribute("user",id);
                  response.sendRedirect("admincss.jsp");   
            }
  
            else {
                out.println("<meta http-equiv='refresh' content='1;URL=LogIncss.jsp'>");//redirects after 3 seconds
               out.println("<p style='color:red;'>Login Id or password incorrect!</p>");
                }
         
          }
            
%>

