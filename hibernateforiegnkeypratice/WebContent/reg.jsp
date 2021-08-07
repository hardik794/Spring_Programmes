<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="regcontroller" method="post">
<table>
	<tr>
		<td>Firstname:
		<td><input type="text" name="fn">
	</tr>
	<tr>
		<td>Lastname:
		<td><input type="text" name="ln">
	</tr>
	<tr>
		<td>Username:
		<td><input type="text" name="un">
	</tr>
	<tr>
		<td>Password:
		<td><input type="text" name="pwd">
	</tr>
	<tr>
		<td><input type="submit" value="Submit">
	</tr>
	</table>	
	</form>
	
	<a href="search">show data</a>

</body>
</html>