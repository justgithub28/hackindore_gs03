


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
     
    <!-- Site Properties -->
    <title>Login form </title>


    <!-- Stylesheets -->
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link href="css_file/signin.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">

</head>
<body class="text-center">
 

    <form class="form-signin" method="post" action="LogIn.jsp">
      <h1 class="h3 mb-3 font-weight-normal">Please Log In</h1>
      <label for="enroll" class="sr-only">Enrollment No</label>
      <input type="enroll" name="userId" class="form-control" placeholder="0801IT161028" required="" autofocus="">
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" name="pwd" class="form-control" placeholder="Password" required="">

      <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
      <button class="btn btn-lg btn-primary btn-block" onclick="location.href='Signupcss.jsp';" type="submit">Register</button>

    </form>


</body>
</html>