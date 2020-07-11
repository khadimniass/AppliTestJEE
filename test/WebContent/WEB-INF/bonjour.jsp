<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ma première page</title>
	</head>
   <body>
 	<p><c:out value="Bonjour avec JSTL"/></p>
	
		<p>
		Bonjour  ${auteur.prenom } ${auteur.nom }
		</p>
		<p>${auteur.actif ? 'Auteur Actif' : 'Vous etes iactif'}</p>
		
		
		
		<%@include file="menu.jsp" %>
		
		<p>
		    <% 
            String attribut = (String) request.getAttribute("variable");
            out.println( attribut );
            %>
		</p>
		
   </body>
</html>