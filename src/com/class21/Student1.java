package com.class21;


public class Student1 {
String studentName;
int studentID;
static int numbersOfStudents;
void display() {
	System.out.println("My name is "+studentName+" and my ID is "+studentID+" and i have "+numbersOfStudents+" other students in my class.");
}

public static void main (String args []) {
	Student1 a=new Student1();
	a.studentName="Dennis";
	a.studentID=1363518;
	Student1.numbersOfStudents++;
	
	Student1 b=new Student1();
	b.studentName="Harman";
	b.studentID=123456;
	Student1.numbersOfStudents++;
		
		
	Student1 c=new Student1();	
	c.studentName="Jai";
	c.studentID=654321;
	Student1.numbersOfStudents++;
	
	
	a.display();
	b.display();
	c.display();	
		
		
		
		
	}	
	}