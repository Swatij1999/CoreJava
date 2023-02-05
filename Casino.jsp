<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	ref="stylesheet"href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<script
	src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzpbzo5smXKp4YfRvH+8abtTE1pi6jizo"
	crossorigin="anonymous">
</script>

</head>

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
   
   <h1>Welcome to Casino.....</h1>
   
   <form action = "enjoy" method = "Post">
   <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Name </label>
      <input type="text" class="form-control" name = "name"
      id="exampleInputEmail1"placeholder="enter name">
      </div>
      
      <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">Cuise </label>
      <input type="text" class="form-control" name = "cuise"
      id="exampleInputEmail1"placeholder="enter cuise">
      </div>
      
      <div class="mb-3">
      <label for="exampleInputEmail1" class="form-label">EntryFees</label>
      <input type="text" class="form-control" name = "entryFee"
      id="exampleInputEmail1"placeholder="entry fee">
      </div>
      
      <select class = "form-select" aria-label = "Default select example" name = "food">
      <option selected > Free food or not </option>
      <option value = "Yes">True </option>
      <option value = "No">False</option>
      </select>
      </div>
      
      <div>
      
      
      <div>
      <input type = "submit" value = "Go to band" class = "btn-dark">
      </div>

</form>
</body>
</html>