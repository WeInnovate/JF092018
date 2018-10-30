<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Profile</title>
</head>
<body>
	<h1 align="center">Customer Profile</h1>
	<table border="1px">
		<tr>
			<td><label>Name</label></td>
			<td>${customer.name}</td>
		</tr>
		<tr>
			<td><label>Age</label></td>
			<td>${customer.age}</td>
		</tr>
	</table>
</body>
</html>