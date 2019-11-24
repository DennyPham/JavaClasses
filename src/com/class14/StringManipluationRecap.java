package com.class14;

public class StringManipluationRecap {

	public static void main(String[] args) {
		
		// String class comes in java lang package
		
		//2ways to creat a string
		//1st way
		String str="Hello";
		//2nd way using "new" keyword- creating a new object
		String str1=new String ("hello");
		System.out.println(str);
		System.out.println(str1);
		
		//find the numbers of characters
		System.out.println(str.length());
		
		//to make all characters lower case
		System.out.println(str.toLowerCase());
		
		//verify if the string is empty
		String myString="";//empty value
		System.out.println(myString.isEmpty());
		String myString1=null;//no value at all
		//String mySting1 same value above
		//System.out.println(myString1.isEmpty());
		
		//how to verify existence of characters in the string
		String a="Good evening students";
		System.out.println(a.contains("students"));
		
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("student"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
