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

import com.LearnersAcademy.Entity.teacher_Subject_Classes;
import com.LearnersAcademy.Util.HibernateUtil;


public class Readteachersubjectclass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Readteachersubjectclass() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			SessionFactory factory = HibernateUtil.getSessionFactory();
			Session session = factory.openSession();

			List<teacher_Subject_Classes> tsc = session.createQuery("select _c from teacher_Subject_Classes _c ").getResultList();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>for teacher  class subjects  Listing</b><br>");

			for (teacher_Subject_Classes c: tsc) {
				out.println("ID: " +  String.valueOf(c.getId()) +  "     classid    " +  String.valueOf(c.getClassid())+"    className:  " +
			c.getClassName()  +  "    subid     "   + String.valueOf(c.getSubjectid())   +"     subname     "+c.getSubjectName()
				+"   teacherid  "+String.valueOf(c.getTeacherid()) +  "    teachername     " +c.getTeacherName()		+ "<br>");
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
