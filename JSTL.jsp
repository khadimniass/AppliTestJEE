<%--Tête de page de Jstl pour accepter les balisex xml de jstl --%>
<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
Session :Retenir le passage d'un visiteur
cookies :C'est une information stockée dans l'ordinateur de l'utilisateur.
	Durée de vie en secondes du cookie. Une fois ce délai expiré, le cookie est détruit sur le poste client par le navigateur. Par défaut la valeur limite la durée de vie du cookie à la durée de vie de l'exécution du navigateu
	Par défaut, combien de temps dure un nouveau cookie ?-->La durée de la session
	De quel type de faille web la balise <c:out /> nous prémunit-elle ? -->La faille XSS
Quelle balise JSTL permet de faire une boucle sur un array ? --> <c:forEach>
Que peut-on trouver dans la variable de statut (définie grâce à l'attribut varStatus) d'une boucle JSTL ?-->Le nombre d'éléments dans le tableau
**********************************Les bases de données**********************************
mysql> create database javaee default character set utf8 collate utf8_general_ci;
L'usage comporte 4 étapes : 
	-Chargement du driver: Pour que l'application communique avec l'application;
	-Connextion à la base de données(address,login,mot de passe...);
	-Exécution de la requète
	-Récupération des données(Parcourir, et afficher les résultats....);
**********************************DAO**********************************
						Data Access Object
-C'est une extension du model MVC
-C'est une intermédiaire entre le modèle et le system de stockage
