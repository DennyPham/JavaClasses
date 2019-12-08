package com.class27;

public class StudentTest {
	public static void main(String[] args) {
		
		
		Student [] studentArray= {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
		for (Student mystudent:studentArray) {
			mystudent.learning();
		}	
		SyntaxStudent obj=new SyntaxStudent();
		obj.code();
		
		CollegeStudent obj1=new CollegeStudent();
		obj1.football();
		
		SchoolStudent obj2=new SchoolStudent();
		obj2.recess();
			
		
	}
}
