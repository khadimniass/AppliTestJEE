package com.octest.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Jstl")
public class Jstl extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Jstl() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] tittre= {"tittre 1","tittre 2","tittre 3","tittre 4"};
		request.setAttribute("tittre", tittre);
		this.getServletContext().getRequestDispatcher( "/WEB-INF/jstl.jsp" ).forward( request, response );	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
