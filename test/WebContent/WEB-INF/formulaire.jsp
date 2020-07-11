<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Formulaire</title>
</head>
<body>
	<%@include file="menu.jsp" %>
 <c:if test="${!empty form.resultat}"><p><c:out value="${form.resultat }" /></p></c:if>

	<%-- 
	 <form method="post" action="Formulaire">AfficheForm
	--%>
	<form method="post" action="Formulaire">
	<p>
	<label for ="log">Login : </label>
	<input type="text" name="login" id="log" />
	</p>

	<p>
	<label for ="pass">Mot de pass : </label>
	<input type="password" name="pass" id="pass" />
	</p>
		
	<input type="submit" value="envoyer"/>
	</form> 
</body>
</html>