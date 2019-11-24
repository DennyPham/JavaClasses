package com.class22;

public class Human {
	//Instance variable
	String name;
	String lastName;
	//Static variable
	static int eyes=2;
	static int nose=1;
	static boolean brain=true;
	
	
	public static void main(String[] args) {
		Human h1=new Human();
		h1.name="Dennis";
		h1.lastName="Pham";
		System.out.println(Human.eyes);
		System.out.println(Human.nose);
		System.out.println(Human.brain);
		
		Human h2=new Human();
		h2.name="Bill";
		h2.lastName="Cosby";
		System.out.println(Human.eyes);
		System.out.println(Human.nose);
		System.out.println(Human.brain);
	}

}
