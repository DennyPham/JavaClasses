package com.class14;

public class MoreStringMethods {

	public static void main(String[] args) {
		//get a character at specific location
		String str="Syntax Technologies Inc";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		
		//System.out.println(str.charAt(str.length()));//out of bounds
		System.out.println(str.charAt(str.length()-1));
		
		// get a substring from a string
		//Syntax
		System.out.println(str.substring(0,6));
		//Technologies Inc
		System.out.println(str.substring(7));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
