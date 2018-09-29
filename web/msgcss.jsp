<!DOCTYPE html>
<!-- saved from url=(0050)http://getbootstrap.com/docs/4.1/examples/sign-in/ -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

    <title>Signin Template for Bootstrap</title>
 <%
        response.setHeader("Cache-Control","no-cache");
        response.setHeader("Cache-Control","no-store");
        response.setHeader("Pragma","no-cache");
        response.setDateHeader("Expires",0);
        %>
    <!-- Bootstrap core CSS -->
    <link href="./msg_files/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./msg_files/signin.css" rel="stylesheet">
  </head>

  <body class="text-center">
       <% 
              String u=(String)request.getSession().getAttribute("user");
          
              %>
              
              <%
                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              %>
    <form class="form-signin">
      <div class="row">
      <div class="col-sm-4">
      <h1 class="h3 mb-2 mt-2 font-weight-normal">NOTICE</h1>
    </div>
    <div class="col-sm-8"></div>
  </div>
      <br>
      <div class="row">
        <div class="col-sm-6">
      <textarea name="message" rows="8" cols="40"     display: block;
    margin-left: auto;
    margin-right: auto;>
       </textarea>
     </div>
     <div class="col-sm-6"></div>
   </div>
       <br>
       <br>
       <div class="row">
        <div class="col-sm-7"></div>
          <div class="col-sm-5">
      <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
      </div>
    </div>
      </form>
  

<script type="text/javascript">function d_log (s) {
                var ev = document.createEvent('events');
                ev.initEvent('heartbeat_log', true, false);
                document.body.setAttribute('heartbeat_attrib', s);
                document.dispatchEvent(ev);
            };</script><div id="heartbeat_msg_wrap"></div></body><button id="javascript-popup-blocker-notify" style="display: none;"></button></html>