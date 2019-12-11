package com.class33;

public class Instructor {
	
	String name, lastName;
	
	Instructor(String name, String lastName){
		this.name=name;
		this.lastName=lastName;	
	}
	
	public void display() {
		System.out.println("Instructore's full name is "+name+" "+lastName);
	}
}
