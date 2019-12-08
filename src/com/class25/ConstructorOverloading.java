package com.class25;

public class ConstructorOverloading {
	
	
	// different amounts of parameters
	ConstructorOverloading() {
		System.out.println("I am non-arguement constructor");
	}
	ConstructorOverloading(String str){
		System.out.println("I am constructor with 1 String param");
	}
	
	
	//different types of parameter
	ConstructorOverloading(int num){
		System.out.println("I am constructor with 1 int param");
	}
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	//can we overload main method? - Yes!
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		
		//
		ConstructorOverloading.main("String");
		String [] array= {"A","B"};
		main("Hello",array);
	}
	public static void main (String str) {
		System.out.println("I am main method with string arguement");
	}
		
	public static void main (String str, String args []) {
		System.out.println("I am a main method with 2 parameters");
	}
}
