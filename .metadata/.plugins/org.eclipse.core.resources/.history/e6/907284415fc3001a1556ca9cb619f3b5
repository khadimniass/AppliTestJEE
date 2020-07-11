package com.octest.servelets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.ConnectionForm;

@WebServlet("/Formulaire")
public class Formulaire extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Formulaire() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( "/WEB-INF/formulaire.jsp" ).forward( request, response );	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ConnectionForm  form = new ConnectionForm();
		
		form.verificationIdentifiant(request);
		
		request.setAttribute("form", form);
		
	this.getServletContext().getRequestDispatcher( "/WEB-INF/formulaire.jsp" ).forward( request, response );	

	}

}
