<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>

	<f:form action="check.html" post="Post" modelAttribute="data">
		
USER_NAME:<f:input path="un" />
		<br />
		<br />
		
PASSWORD:<f:input path="pass" />
		<br />
		<br />
		<input type="submit" value="Submit">
	</f:form>

</body>
</html>