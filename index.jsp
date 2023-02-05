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

<body>

<nav class="navbar navbar-light bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#"><img
     src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
     alt = ""width = "80" height="48"class="d-line-block align-text-top">
     </a>
     <a href = "index.jsp">Home</a>
   </div>
   </nav>
   <h1>Welcome to Beach.....</h1>
   
   <form action = "sea" method = "post">
   <div class="mb-3">
   <label for = "exampleInputEmail" class="form-label">Name</label>
   <input type="text"class="form-control"name="name"
   id="exampleInputEmail"placeholder="enter name">
   </div>
   
   
    <div class="mb-3">
   <label for = "exampleInputEmail" class="form-label">Location</label>
   <input type="text"class="form-control"name="location"
   id="exampleInputEmail"placeholder="enter location">
   </div>
   
    <div class="mb-3">
   <label for = "exampleInputEmail" class="form-label">Game</label>
   <input type="text"class="form-control"name="game"
   id="exampleInputEmail"placeholder="enter fee">
   </div>
   
   <select class = "form-select" aria-lable = "Default select example"name="clear">
   <option selected>Clean or not </option>
   <option value = "Yes">True</option>
   <option value ="No">False</option>
   </select>
   </div>
   
   <input type="Submit" value = Go to beach"class = "btn btn-dark">
   </div>
   
   </form>

</body>
</html>