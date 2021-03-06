package com.octest.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;


@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Auteur auteur = new Auteur();
		auteur.setNom("Niass");
		auteur.setPrenom("Khadim");
		auteur.setActif(false);
		
		request.setAttribute("auteur",auteur);
		
		String nameUser= request.getParameter("name");
		request.setAttribute("name", nameUser);
		
		String message = "Bien, Transmission de variables : OK !";
		request.setAttribute( "variable", message );
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/bonjour.jsp" ).forward( request, response );	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
