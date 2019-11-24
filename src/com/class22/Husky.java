package com.class22;

public class Husky {
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	
	String name;
	String color;
	
	void display() {
		System.out.println("Puppy is a "+breed+" and he/she is "+color+" and name is "+name+" with "+paws+" paws and with "+tail+" tail");
	}
	public static void main(String[] args) {
		
		Husky pup1=new Husky();
		Husky pup2=new Husky();
		
		pup1.name="Zeus";
		pup1.color="Grey";
		
		pup2.name="Shrek";
		pup2.color="Green";
		
		pup1.display();
		pup2.display();
		
		Husky pup3=new Husky();
		breed="Doberman";
		pup3.name="JackJack";
		pup3.color="Black";
		
		pup1.display();
		pup2.display();
		pup3.display();
		
		
		
	}

}
