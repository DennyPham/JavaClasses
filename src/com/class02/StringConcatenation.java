package com.class02;

public class StringConcatenation {
	public static void main (String [] args) {
		
		String name=" Anna";
		//Display in console "Good morning Anna"
		
		System.out.println("Good morning" + name);
		
		int day=22;
		//Today is September 22
		
		System.out.println("Today is September "+ day);
		
		String text="Today is September ";
		
		System.out.println(text+day);
		//My name is Dennis Pham
		//I live in the city of Springfield
		//My phone number is "(571)-523-4656"
		
		name="Dennis Pham ";
		String live="Springfield ";
		String phoneNumber= "(571)-523-4656";
		
		System.out.print("My name is "+ name);
		System.out.print("I live in the city of " +live);
		System.out.println("My phone number is "+ phoneNumber);
		
		int num1=12;
		int num2=13;
		//the value of num1=____ and the value of num2=___
		System.out.println("The vaule of num1="+num1+ " and the value of num2="+num2);
		
		String fruit="banana";
		char dollar='$';
		double price=1.99;
		// the price of banana is $1.99!!!
		System.out.println("The price of " + fruit+ " is "+ dollar+price+"!!!");
				
	}

}
