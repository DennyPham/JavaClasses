package com.class23;

public class Constructor {
	
	Constructor(){
		System.out.println("I am your constructor");
	}
	public void hello() {
		System.out.println("Hello Class");
		System.out.println("Hello Instructors");
	}

	public static void main(String[] args) {
	
		Constructor obj=new Constructor();
		System.out.println("Code after creating an Object");
		
		obj.hello();
		
		
	}
}
