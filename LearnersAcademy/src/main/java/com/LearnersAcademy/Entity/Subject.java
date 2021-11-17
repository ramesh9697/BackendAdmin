package com.LearnersAcademy.Entity;
import java.util.List;

import javax.persistence.*; 

@Entity
@Table(name = "Subject")


public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Subjectid;
	private String SubjectName;
	
	
	

	
	public Subject()
	{
		
	}
	
	

	
	public int getSubjectid() {
		return Subjectid;
	}
	
	public void setSubjectid(int subjectid) {
		Subjectid = subjectid;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}




	
	
	
}
