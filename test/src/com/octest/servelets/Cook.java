package com.octest.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;


@WebServlet("/Cook")
public class Cook extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Cook() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("prenom")) {
                    request.setAttribute("prenom", cookie.getValue());
                }
            }
        }
		
        this.getServletContext().getRequestDispatcher("/WEB-INF/cookie.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nom = request.getParameter("nom");
	     String prenom = request.getParameter("prenom");
	     response.addCookie(new Cookie("prenom",prenom));
	     
        this.getServletContext().getRequestDispatcher("/WEB-INF/cookie.jsp").forward(request, response);
	}

}
