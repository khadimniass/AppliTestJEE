package com.octest.beans;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
private String resultat;

public void verificationIdentifiant(HttpServletRequest request)
{
	String login = request.getParameter("login");
	String pass= request.getParameter("pass");
	
	if(pass.equals(login)) {
		resultat="Bravo vous �tes bien connect� ::-)";
		
	}else {
		resultat = "D�sol� mot de pass erron� !!!";
	}
}

public String getResultat() {
	return resultat;
}

public void setResultat(String resultat) {
	this.resultat = resultat;
}

 
}
