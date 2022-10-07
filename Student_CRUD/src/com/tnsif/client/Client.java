package com.tnsif.client;

import com.tnsif.entity.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client {
	public static void main(String[] args) {
	//Debug this program as Debug -> Debug as Java
	//Application
		
	StudentService service = new StudentServiceImpl();
	Student student = new Student();
	/*
	// Create Operation
	student.setStudentid(14);
	student.setName("new");
	service.addStudent(student);
	*/
	
	/*
	//at this breakpoint, we have added one record to table
	// Retrieve Operation
	student = service.findStudentById(7);
	System.out.print("ID:"+student.getStudentid());
	System.out.println(" Name:"+student.getName());
	*/
	
	/*
	// Update Operation
	student = service.findStudentById(14);
	student.setName("Got7");
	service.updateStudent(student);
	
	//at this breakpoint, we have updated record added in first section
	student = service.findStudentById(14);
	System.out.print("ID:"+student.getStudentid());
	System.out.println(" Name:"+student.getName());
	*/
	
	
	//at this breakpoint, record is removed from table
	// Delete Operation
	student = service.findStudentById(14);
	service.removeStudent(student);
	
	System.out.println("End of program/Life cycle completed...");
	
	}
}
