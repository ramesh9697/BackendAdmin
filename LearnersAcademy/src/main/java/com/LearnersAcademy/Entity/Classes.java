package com.LearnersAcademy.Entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Classes")


public class Classes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Classid;
	private String ClassName;
	
	

	
	public Classes()
	{
		
	}
	public int getClassid() {
		return Classid;
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
