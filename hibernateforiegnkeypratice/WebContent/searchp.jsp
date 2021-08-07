<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>display data </title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<table border="1px solid red">
	<tr>
	<td>Id</td>
	<td>Firstname</td>
	<td>Lastname</td>
	<!-- <td>Username</td>
	<td>Password</td> -->
	<td>login_id</td>
	<td>delete</td>
	<td>edit</td>
	</tr>
	
<c:forEach items="${sessionScope.List}" var="i">

	<tr>
		<td>${i.rid}</td>
		<td>${i.fn}</td>
		<td>${i.ln}</td>
		<td>${i.login.id}</td>
		
		<%-- <td>${i.un}</td>
		<td>${i.pwd}</td> --%>
		<td> <a href="deletep?id=${i.login.id }">delete</a></td>	
		<td> <a href="editp?id=${i.login.id} ">edit</a>
	</tr>


</c:forEach>

</table>

</body>
</html>