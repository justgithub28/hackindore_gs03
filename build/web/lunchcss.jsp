<!DOCTYPE html>
<%@page import="java.sql.PreparedStatement" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.util.ArrayList" %>


<html lang="en">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Student Menu</title>
    <%
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        %>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

  </head>

  <body class="bg-light">
      <nav class="navbar navbar-light bg-light">
          <% 
              String u=(String)request.getSession().getAttribute("user");
          
              %>
              
              <%
                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              %>
              <button class="btn btn-lg btn-primary " type="submit" onclick="location.href('LogIncss.html');">Home</button>
  <form method="post" action="LogOut.jsp">
         <button class="btn btn-lg btn-primary " type="submit">Logout</button>
  </form>
      </nav>

    <div class="container">

      <div class="py-5 text-center"


     <div class="row">
       <h2><b>Student Menu</b></h2>
     
  
             
                <%
                     ArrayList list1=new ArrayList();
                     ArrayList list2=new ArrayList();
                     ArrayList list3=new ArrayList();
                     ArrayList list4=new ArrayList();
                     ArrayList list5=new ArrayList();
                     ArrayList list6=new ArrayList();
                     ArrayList list7=new ArrayList();
                     ArrayList list8=new ArrayList();
                     ArrayList list9=new ArrayList();
                     ArrayList list10=new ArrayList();
                     ArrayList list11=new ArrayList();
                     
                 Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hackindore","root","root");
                PreparedStatement st=con.prepareStatement("select * from menu where Shift='Lunch'");
               ResultSet rs=st.executeQuery();
           while(rs.next())
        {
            list1.add(rs.getString(1));
            list2.add(rs.getString(2));
            list3.add(rs.getString(3));
            list4.add(rs.getString(4));
            list5.add(rs.getString(5));
            list6.add(rs.getString(6));
            list7.add(rs.getString(7));
            list8.add(rs.getString(8));
            list9.add(rs.getString(9));
            list10.add(rs.getString(10));
            list11.add(rs.getString(11));
          
        }
           int i=0;
           %>
          
           <button class="btn btn-lg btn-primary " type="submit" ><%=list1.get(i)%></button>
     
           <div class="dishes">
               <label>  <%=list2.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list3.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list4.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list5.get(0)%> </label>
           </div><div class="dishes">
               <label>  <%=list6.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list7.get(0)%> </label>
           </div>
            <div class="dishes">
               <label>  <%=list8.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list9.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list10.get(0)%> </label>
           </div>
           <div class="dishes">
               <label>  <%=list11.get(0)%> </label>
           </div>
                  
           
           
                
            <div class="row">
              <div class="col-md-4"></div>
              <div class="col-md-3">
                  <div class="form-group form-check">
                                 
                    
                                   
                    <button class="btn btn-primary  btn-block" type="submit" onclick="location.href='lunch.jsp'">Interested</button>
                    <button class="btn btn-primary  btn-block" type="submit" onclick="location.href='lunchcss.jsp'">Back</button>
                 
                       </div>
              </div>
            </div>

 
        </div>
      
    

   


</body>
</html>
