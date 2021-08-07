<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRATION PAGE</title>
</head>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<body>

	<f:form action="insert.html" post="Post" modelAttribute="RegVO">
FIRST_NAME:<f:input path="firstName" />
		<br />
		<br />
LAST_NAME:<f:input path="lastName" />
		<br />
		<br />
		USERNAME:<f:input path="loginVo.username" />
		<br />
		<br />
		PASSWORD<f:input path="loginVo.password" />
		<br />
		<br />
		<f:hidden path="id" />
		<f:hidden path="loginVo.id"/>
		<input type="submit" value="Submit">
	</f:form>

</body>
</html>