<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<tr>
			<td><label>Gender</label></td>
			<td>${customer.gender}</td>
		</tr>
		<tr>
			<td><label>Country</label></td>
			<td>${customer.country}</td>
		</tr>
		<tr>
			<td><label>Courses</label></td>
			<td>${customer.courses[0]}&nbsp;${customer.courses[1]}&nbsp;${customer.courses[2]}&nbsp;</td>
		</tr>
		<tr>
			<td><label>Country</label></td>
			<td>${customer.areYouExperienced}</td>
		</tr>
		<tr>
			<td><label>Comment</label></td>
			<td>${customer.comment}</td>
		</tr>
	</table>
</body>
</html>