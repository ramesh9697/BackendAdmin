package com.LearnersAcademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.LearnersAcademy.Entity.Classes;
import com.LearnersAcademy.Util.HibernateUtil;


public class ReadClasses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public ReadClasses() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			// using HQL
			List<Classes> ClassList = session.createQuery("select _c from Classes _c").getResultList();
			

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>class Listing</b><br>");

			for (Classes c: ClassList) {
				out.println("ID: " + String.valueOf(c.getClassid()) + ", Name: " + c.getClassName()
						+ "<br>");
			}

			out.println("</body></html>");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
