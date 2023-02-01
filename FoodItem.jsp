<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous">
</script>

</head>
<body style = 'color : red'>
<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"> <img
     src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = ""width = "80" height="48"class="d-line-block align-text-top">
     </a>
     
     <a href = "index.jsp">Home </a>
   </div>
   </nav>
   
   <h1>Page to send food item...</h1>
   <form action = "send" method = "post">
   <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Name </label>
      <input type="text" class="form-control" name = "name"
      id="exampleInputEmail"placeholder="enter food item name">
      </div>
      
      <select class = "form-select" aria-label = "Default select example" name = "type">
      <option selected > Select Food type </option>
      <option value = "Veg">Veg </option>
      <option value = "NonVeg"> Non-Veg</option>
      <option value = "Both">Both</option>
      </select>
      </div>
      
      <div>
      <label for = "customRange2" class ="form-label">Quantity</label>
      <input type = "range" class = "form-range"min = "0" max = "5" name = "quantity" id ="customRange2">
      </div>
      
      <div class="mb-3">
      <label for="exampleInputEmail1"class="form-label">Price</label>
      <input type="text"class="form-control"name="price"
      id="exampleInputEmail1"placeholder= "enter food item price">
      </div>
      
      <div>
      <input type = "submit" value = "Send" class = "btn-dark">
      </div>


</body>
</html>