package com.LearnersAcademy.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Teacher")


public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Teacherid;
	private String TeacherName;
	public Teacher()
	{
		
	}
	public int getTeacherid() {
		return Teacherid;
	}
	public void setTeacherid(int teacherid) {
		Teacherid = teacherid;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}

}
