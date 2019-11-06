package com.class2;

public class Variables {
	public static void main (String [] args) {
		
		String name="Dennis";
		String lastName="pham";
		char grade='B';
		String city="Springfield";
		String state="Virginia";
		String phoneNumber="(703)-623-6351";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		
		name=" Steven ";
		city=" Falls Church ";
		state=" California ";
		phoneNumber= "(571)-732-2354";
		grade='A';
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		System.out.println(name + lastName + city + phoneNumber +grade);
	}

}
