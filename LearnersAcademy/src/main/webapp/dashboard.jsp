<%@page import="java.util.Objects"%>
<%@page import="java.util.List"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dashboard Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	


	
	<div class="container mt-3">
		<h2>Welcome to Learners Academy</h2>
		  <a href="logout.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a>
		  <a href="Students"> <button class="btn btn-primary">View Students</button></a>
		  <a href="Teachers"> <button class="btn btn-primary">View Teachers</button></a>
		  <a href="Subjects"> <button class="btn btn-primary">View Subjects</button></a>
		  <a href="Classes"> <button class="btn btn-primary">View Classes</button></a>
		  <a href="SubjectClasses"> <button class="btn btn-primary">View SubjectClasses</button></a>
		
				
		
	</div>

</body>
</html>