package com.LearnersAcademy.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Classes")


public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Classid;
	private String ClassName;
	public int getClassid() {
		return Classid;
	}
	public Classes()
	{
		
	}
	public void setClassid(int classid) {
		Classid = classid;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	
	

}
