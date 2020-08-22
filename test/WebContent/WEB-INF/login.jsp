<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form method="post" action="Login">	
	<h2 style="color:red;">${message}</h2>
	<h2 style="color:green;">${ successMessage }</h2>	
	<div>
		<label for ="login">Login : </label>
		<input type="text" name="login" id="login" require="require"/>
	</div>

	<div>
		<label for ="password">Mot de pass : </label>
		<input type="password" name="pass" id="password" require="require"/>
	</div>
	
	<table>
	  	<tr>
		    <td><input type="submit" name="submit" value="Login"/></td>
		    <td><a href="Register">Registration</a></td>
	  	</tr>
	</table>
 </form>
</body>
</html>