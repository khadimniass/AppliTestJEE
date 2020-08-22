<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page of registration</title>
</head>
<body>
	<form method="post" action="Register">	
	<div>	
		<div>
		<label for ="login">Login : </label>
		<input type="text" name="login" id="login" require="require"/>
		</div>
		
	 <div>
		<label for ="nom">Name : </label>
		<input type="text" name="nom" id="nom" require="require"/>
	</div>
	
		<div>
		<label for ="password">Mot de pass : </label>
		<input type="password" name="pass" id="password" require="require"/>
		</div>

		<div>
		<label for ="repassword">Retaper Mot de pass : </label>
		<input type="password" name="repassword" id="repassword" require="require"/>
		</div>			
		<input type="submit" name="submit" value="Register"/>
		<a href="Login">Login</a>
	</div>
	</form>
</body>
</html>