<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Les Tests Jstl</title>
	</head>
	<body>
	<%@include file="menu.jsp" %>
	<c:if test="${50>10 }">
		<p>C'est toujours vrai </p> <%--Inconvénient pas de condition multiple ! --%>
	</c:if>	
	<%--Solution des conditions c:choose --%>
	
	
<c:forEach begin="0" end="10" step="2" var="i">
	<c:out value="line: ${i}"/><br>
</c:forEach>
<%-- Boucle calculant le cube des entiers de 0 à 7 et les affichant dans un tableau HTML --%>


<c:forEach items="${tittre }" var="i" varStatus="j">
	<p>Tittre N°<c:out value="${j.count }"/><c:out value=" ${i}"/>   !</p><br>
</c:forEach>

	</body>
</html>