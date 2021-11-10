package com.LearnersAcademy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONObject;

import com.LearnersAcademy.Entity.Student;
import com.LearnersAcademy.Util.HibernateUtil;


public class ReadStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ReadStudents() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			// using HQL
			List<Student> StudentList = session.createQuery("select _s from Student _s").getResultList();
			

			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Student Listing</b><br>");

			for (Student s: StudentList) {
				out.println("ID: " + String.valueOf(s.getStudentid()) + ", Name: " + s.getStudentName()
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
