<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Welcome Home</h1>
	<ul>
		<li><a href="greet">Greet</a></li>
		<li><a href="greetMe?name=Prateek">Greet Me</a></li>
		<li><a href="greetMeRequestParam?name=Prateek">Greet Me[Request Param]</a></li>
		<li><a href="greetMePathParam/Prateek">Greet Me[Path Variable]</a></li>
		<li><a href="customerOrder/101/111123">My Order[Multiple Path Variable]</a></li>
		<li><a href="modelExample">Model Example</a></li>
		<li><a href="register">Sign Up</a></li>
	</ul>
</body>
</html>