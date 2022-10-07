package com.tnsif.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Informing the program about the database

@Entity
@Table(name="student")

public class Student implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	//used to tell the primary key
	@Id 
	private int studentid;
	
	private String name;
	
	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + "]";
	}
	
	

}


