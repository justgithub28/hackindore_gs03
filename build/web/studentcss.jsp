<!DOCTYPE html>
<html lang="en">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Menu</title>
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

  <body class="bg-light" style="background-color: ">

    <% 
              String u=(String)request.getSession().getAttribute("user");
          
              %>
              
              <%
                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              %>


     <nav class="navbar navbar-light bg-light">
  <button class="btn btn-lg btn-primary " onclick="location.href='LogIncss.jsp';" type="submit">Home</button>
         <button class="btn btn-lg btn-primary " onclick="location.href='LogIncss.jsp';" type="submit">Logout</button>
</nav>

    <div class="jumbotron jumbotron-fluid">
    <div class="container">
         <div class="row" style="background-color: aquamarine">
             <div class="col-md-12">
                 <h2 style="text-align: center">Student</h2>
            </div>
         </div>
        <br>
        <br>
        <br>

      <div class="row ">
            <div class="col-md-4"></div>
            <div class="col-md-4">
                <button class="btn btn-lg btn-primary btn-block" onclick="location.href='breakfastcss.jsp';" type="submit">View Breakfast Menu</button>
                <button class="btn btn-lg btn-primary btn-block" onclick="location.href='lunchcss.jsp';" type="submit">View Lunch Menu</button>
                <button class="btn btn-lg btn-primary btn-block" onclick="location.href='dinnercss.jsp';" type="submit">View Dinner Menu</button>
                <button class="btn btn-lg btn-primary btn-block" onclick="location.href='notifycss.jsp';" type="submit">View Notifications</button>
            </div>
        </div>
    </div>
  </div>
</body>
</html>