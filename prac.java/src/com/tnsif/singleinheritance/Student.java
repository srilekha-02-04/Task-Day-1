package com.tnsif.singleinheritance;

public class Student  extends Person{
	int rollno;
	String course;
	void displayStudentdetails() {
		System.out.println("Rollno:"+rollno);
		System.out.println("Course:"+course);
	}

}
