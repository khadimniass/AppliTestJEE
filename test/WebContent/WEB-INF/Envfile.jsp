<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Envoyer un fichier</title>
</head>
<body>
    <c:if test="${ !empty fichier }"><p><c:out value="Le fichier ${ fichier } (${ titre }) a été uploadé !" /></p></c:if>

<form action="Envfile" enctype="multipart/form-data">
	<p>
		<label for="titre">titre du fichier</label>
		<input type="text" name="titre" id="titre" />
	</p>
	
	<p>
		<label for="fichier">titre du fichier</label>
		<input type="file" name="fichier" id="fichier"/>
	</p>
	<input type="submit" value="Envoyer" />
</form>

</body>
</html>