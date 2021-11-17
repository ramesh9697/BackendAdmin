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

import com.LearnersAcademy.Entity.Subject;
import com.LearnersAcademy.Util.HibernateUtil;


public class ReadSubjects extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadSubjects() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			// using HQL
			List<Subject> SubjectList = session.createQuery("select _sub from Subject _sub").getResultList();
			

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>subject Listing</b><br>");

			for (Subject s1: SubjectList) {
				out.println("ID: " + String.valueOf(s1.getSubjectid()) + ", Name: " + s1.getSubjectName()
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
