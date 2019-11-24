package com.class22;

public class StaticVsNonStatic {

	//template for a student (school, name, grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	// instance method, non static
	void getInfo() {
		System.out.println("My name is "+name+" and I am attending "+
							school+" and i have a grade of "+grade);
		}
	//Static method
	static void getInfo1() {
	 	System.out.println("I am attendning at "+school);
	}
	public static void main(String[] args) {
		//accessing static member within same class
		//--> just use name
		//or call method by it's name only
		System.out.println(school);
		getInfo1();
	}
}
