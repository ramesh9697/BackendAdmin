package com.LearnersAcademy.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
