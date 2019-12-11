package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int studentId;
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	public void display() {
		System.out.println("My name is "+name+" and my student Id is "+studentId);
	}
}

public class StudentTest  {

	public static void main(String[] args) {
		//create an ArrayList that will store student type of Object
		List<Student> students=new ArrayList<>();
		
		
		Student stu=new Student("Dennis",123456);
		Student stu1=new Student("Jacob",123);
		Student stu2=new Student("Amy",987);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display of each student
		stu.display();
		stu1.display();
		stu2.display();
		System.out.println("--------------------");
		//for each loop
		for(Student student:students) {
			student.display();
		}
		//adding more object of a student class
		students.add(new Student("Jonny",4545));
		students.add(new Student("Becky",7655));
		students.add(new Student("Tony",9312));
		System.out.println("-----------------------");
		//display of each student using Iterator
		Iterator<Student>it=students.iterator();
		while(it.hasNext()) {
			it.next().display();
		}
		
		
		
	}

}
