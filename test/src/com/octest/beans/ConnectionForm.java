package com.octest.beans;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
private String resultat;

public void verificationIdentifiant(HttpServletRequest request)
{
	String login = request.getParameter("login");
	String pass= request.getParameter("pass");
	
	if(pass.equals(login)) {
		resultat="Bravo vous êtes bien connecté ::-)";
		
	}else {
		resultat = "Désolé mot de pass erroné !!!";
	}
}

public String getResultat() {
	return resultat;
}

public void setResultat(String resultat) {
	this.resultat = resultat;
}

 
}
