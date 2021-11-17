package com.LearnersAcademy.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

import org.hibernate.annotations.ManyToAny;


@Entity
@Table(name = "Student")

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Studentid;
	private String StudentName;
	
	  
   
	
	public Student()
	{
		
	}
	public Student(String StudentName)
	{
		super();
		this.StudentName=StudentName;
		
		
	}
	public int getStudentid() {
		return Studentid;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	
	
	
	
	
	

}
