<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Model Example</title>
</head>
<body>
	<h1>Hello ${name},</h1>
	<p>This is model learning...</p>
	<c:forEach var="fruit" items="${fruits}">
${fruit} &nbsp;
</c:forEach>
</body>
</html>