<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="check.html" method="post">
<table>

<!--  <tr>
<td><input type="hidden" name="fn" value="${fn }"></td>
<td><input type="hidden" name="ln" value="${ln }"></td>
<td><input type="hidden" name="reg_un" value="${un }"></td>
<td><input type="hidden" name="reg_pass" value="${pass }"></td>
</tr>
 -->

	<tr>
		<td>Username:
		<td><input type="text" name="login_un">
	</tr>
	<tr>
		<td>Password:
		<td><input type="password" name="login_pass">
	</tr>
	<tr>
		<td><input type="submit" name="Add data">
	</tr>
</table>
</form>
</body>
</html>