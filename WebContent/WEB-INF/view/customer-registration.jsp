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
				<td><input type="reset" ></td>
				<td><input type="submit" value="Register" ></td>
			</tr>
		</table>
	</form:form>
</body>
</html>