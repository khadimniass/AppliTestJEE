<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mon acceuil</title>
</head>
<body>
	<p>Welcome On our home page.</p>
		<%@include file="menu.jsp" %>
		<p>
		<%
		for(int i=0;i<20;i++){
			out.println("line number "+i+"<br>");
		}
		 %>
		</p>

</body>
</html>