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

  <body class="bg-light">
     <% 
              String u=(String)request.getSession().getAttribute("user");
          
              %>
              
              <%
                  
                 
              if(u==null)
              {
                response.sendRedirect("LogIncss.jsp");   
              }
              %>

    <div class="container">

      <div class="py-5 text-center"


     <div class="row">
       <h2><b>Menu</b></h2>

        <div class="col-md-12 ">
          <form class="needs-validation" novalidate="" action="menu.jsp">

            <div class="row">

              <div class="col-md-3">
                <select class="form-control" name="shift">
                  <option>Lunch</option>
                  <option>Dinner</option>
                  <option>Breakfast</option>
                </select>
                 </div>
            </div>

            <br>

            <div class="row">
              <div class="col-md-6 mb-3">
                <label for="dish1">Dish 1</label>
                <input type="text" class="form-control" name="dish1" placeholder="" value="">
                <div class="invalid-feedback">
                  Atleast one dish is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish2">Dish 2</label>
                <input type="text" class="form-control" name="dish2" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>

              <div class="col-md-6 mb-3">
                <label for="dish3">Dish 3</label>
                <input type="text" class="form-control" name="dish3" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish4">Dish 4</label>
                <input type="text" class="form-control" name="dish4" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish5">Dish 5</label>
                <input type="text" class="form-control" name="dish5" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish6">Dish 6</label>
                <input type="text" class="form-control" name="dish6" placeholder="" value="">
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
                 <div class="col-md-6 mb-3">
                <label for="dish1">Dish 7</label>
                <input type="text" class="form-control" name="dish7" placeholder="" value="">
                <div class="invalid-feedback">
                  Valid first name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish2">Dish 8</label>
                <input type="text" class="form-control" name="dish8" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>

              <div class="col-md-6 mb-3">
                <label for="dish3">Dish 9</label>
                <input type="text" class="form-control" name="dish9" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
              <div class="col-md-6 mb-3">
                <label for="dish4">Dish 10</label>
                <input type="text" class="form-control" name="dish10" placeholder="" value="" >
                <div class="invalid-feedback">
                  Valid last name is required.
                </div>
              </div>
            </div>



            <div class="row">
              <div class="col-md-4"></div>
              <div class="col-md-3">
                 <button class="btn btn-primary btn-lg btn-block" type="submit">Submit</button>
              </div>
            </div>

          </form>
        </div>
      </div>
    </div>




    </div>

    <script>
      // Example starter JavaScript for disabling form submissions if there are invalid fields
      (function() {
        'use strict';

        window.addEventListener('load', function() {
          // Fetch all the forms we want to apply custom Bootstrap validation styles to
          var forms = document.getElementsByClassName('needs-validation');

          // Loop over them and prevent submission
          var validation = Array.prototype.filter.call(forms, function(form) {
            form.addEventListener('submit', function(event) {
              if (form.checkValidity() === false) {
                event.preventDefault();
                event.stopPropagation();
              }
              form.classList.add('was-validated');
            }, false);
          });
        }, false);
      })();
    </script>


</body>
</html>