<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
</head>
<body>
	<h1 align="center">Customer Registration</h1>
	<form:form action="register" method="post" modelAttribute="customer">
		<table border="1px">
			<tr>
				<td><label>Name</label></td>
				<td><form:input type="text" path="name" /></td>
			</tr>
			<tr>
				<td><label>Age</label></td>
				<td><form:input type="text" path="age" /></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td>Male: <form:radiobutton path="gender" value="Male" /> &nbsp; Female: <form:radiobutton path="gender" value="Female" /></td>
			</tr>
			<tr>
				<td><label>Country</label></td>
				<td><form:select path="country">
				<form:option value="IND">India</form:option>
				<form:option value="USA">United States of America</form:option>
				<form:option value="UK">United Kingdom</form:option>
				</form:select></td>
			</tr>
			<tr>
				<td><label>Courses</label></td>
				<td>M1: <form:checkbox path="courses" value="Core Java" /> &nbsp;
				M2: <form:checkbox path="courses" value="Advance Java" />&nbsp;
				M3: <form:checkbox path="courses" value="Java Frameworks" /></td>
			</tr>
			<tr>
				<td><label>Are You Experienced?</label></td>
				<td><form:checkbox path="areYouExperienced" /></td>
			</tr>
			<tr>
				<td><label>Comment</label></td>
				<td><form:textarea path="comment" cols="20" rows="5" /></td>
			</tr>
			<tr>
				<td><input type="reset" ></td>
				<td><input type="submit" value="Register" ></td>
			</tr>
		</table>
	</form:form>
</body>
</html>