package com.class24;

public class ThisWithConstructor {

	public ThisWithConstructor() {
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this(); //used to call current class constructor
		System.out.println("i am constructor with 1 string parameter");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("Hello");
		//can we execute 2 constructor at the same time
		//yes- it can be achieved using this()
	}
	
	
}
