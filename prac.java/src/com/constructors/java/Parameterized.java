package com.constructors.java;

public class Parameterized {


		public static void main(String[] args) {
			
			        Student1 s = new Student1(20, "Lekha");

			        System.out.println("Name : " + s.name + " RollNo : " + s.rollNo);
			    }
			}

			class Student1 {

			    int rollNo;
			    String name;

			    // Parameterized Constructor
			    Student1(int r, String n) {
			        rollNo = r;
			        name = n;
			    }
			}

