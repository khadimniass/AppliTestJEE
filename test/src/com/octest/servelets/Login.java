package com.octest.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import login.submit.registration.Customer;
import login.submit.registration.CustomerDAO;
import login.submit.registration.CustomerDAOImplement;
//import sun.java2d.loops.CustomComponent;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO cd=new CustomerDAOImplement();
		
		String login=request.getParameter("login");
		String password=request.getParameter("password");
		String submitType=request.getParameter("submit");
		
		Customer c = cd.getCustomer(login, password);
		if (submitType.equals("Login") && c.getName()!=null) {
			request.setAttribute("message",c.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
			
		}else if(submitType.equals("Register")) {
			c.setName(request.getParameter("nom"));
			c.setPassword(password);
			c.setUsername(login);
			cd.insertCustomer(c);
			
			
			
			request.setAttribute("successMessage", "Registration done, please login to cary on !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);			
		}else {
			request.setAttribute("message", "Data not found,Click on Register !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		
		
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/login.jsp" ).forward( request, response );	
	}

}
