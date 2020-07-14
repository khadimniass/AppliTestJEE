<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<title>Les sessions</title>
</head>
<body>
    <c:if test="${ !empty sessionScope.prenom && !empty sessionScope.nom }">
        <p>Vous êtes ${ sessionScope.prenom }  ${ sessionScope.nom } !!! Ta visite a été bien retenu.</p>
    </c:if>
    <form method="post" action="Session">
        <p>
            <label for="nom">Nom :</label>
            <input type="text" name="nom" id="nom" />
        </p>
        <p>
            <label for="prenom">Prénom :</label>
            <input type="text" name="prenom" id="prenom" />
        </p>
        
        <input type="submit" value="Terminer"/>
    </form>
    	<%@include file="menu.jsp" %>
</body>
</html>