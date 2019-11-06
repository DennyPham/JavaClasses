package com.class12;

public class StringManipulation {

	public static void main(String args[]) {

		// There are two ways to create a String object
		// 1
		// String literal
		String name = "John";
		System.out.println(name);
		System.out.println("The length of the name is = " + name.length());
		// 2
		// Creating String with new key word
		String name1 = new String("John1");
		System.out.println(name1);

		/*
		 * This method returns the length of this String The length is equal to the
		 * number of 16 bits Unicode character in the String
		 */

		int name1Len = name1.length();

		System.out.println("The length of Name1Len is = " + name1Len);

		
		String str1= "Hello World! ";
		System.out.println("Before: "+str1);
		str1=str1.toLowerCase();
		System.out.println("After:"+str1);
		
		
		System.err.println(str1.trim());
		
		
		
		
		
		
		
		
		
	}
}
