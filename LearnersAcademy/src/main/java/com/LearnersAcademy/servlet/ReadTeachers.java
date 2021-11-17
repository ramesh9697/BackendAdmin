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

import com.LearnersAcademy.Entity.Teacher;
import com.LearnersAcademy.Util.HibernateUtil;



public class ReadTeachers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadTeachers() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			// using HQL
			List<Teacher> TeacherList = session.createQuery("select _t from Teacher _t").getResultList();
			

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Teacher Listing</b><br>");

			for (Teacher t: TeacherList) {
				out.println("ID: " + String.valueOf(t.getTeacherid()) + ", Name: " + t.getTeacherName()
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
