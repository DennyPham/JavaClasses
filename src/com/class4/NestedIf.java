package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		boolean b=true;
		boolean classToday=false;
		
		if (b) {
			System.out.println("Hello");
			if(classToday) {
				System.out.println("Hello my friend");
			}
		}else {
			System.out.println("Bye");
		}
		System.out.println("I am continues code");
	}

}
