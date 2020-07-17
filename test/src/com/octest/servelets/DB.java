package com.octest.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.bdb.Noms;
import com.octest.beans.Utilisateur;

@WebServlet("/DB")
public class DB extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DB() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noms tableNoms= new Noms();
		request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/BD.jsp" ).forward( request, response );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getParameter("nom"));
        utilisateur.setPrenom(request.getParameter("prenom"));
        
        Noms tableNoms = new Noms();
        tableNoms.ajouterUtilisateur(utilisateur);
        
        request.setAttribute("utilisateurs", tableNoms.recupererUtilisateurs());
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/BD.jsp" ).forward( request, response );
	}

}
