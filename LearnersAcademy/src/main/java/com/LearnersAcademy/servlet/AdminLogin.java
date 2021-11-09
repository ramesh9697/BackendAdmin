package com.LearnersAcademy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		System.out.println("Username :- "+ username + " Password :- "+ password);
		

		if (username == null | "".equals(username)) {
			response.sendRedirect("invalid.jsp?error=1");
		} else if (password == null | "".equals(password)) {
			response.sendRedirect("invalid.jsp?error=2");
		} else {
			if ("LearnersAcademyAdmin".equals(username) && "admin@123".equals(password)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", username);
				request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			}
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
