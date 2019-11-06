package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		/*
		 * ask user to enter age
		 * if age is from 1-3 --> you are a baby
		 * if your age is from 3-5 --> you are a toddler
		 * if your age 5-12 --> you are a kid
		 * if your age is from 13-19 ---> you are a teenager
		 * if you age is >20 --> you are an adult
		 */
	Scanner old=new Scanner (System.in);
	System.out.println("Enter you age");
	int age=old.nextInt();
	if (age < 3) {
		System.out.println("You are a baby");
	}else if (age>=3 && age<=5) {
		System.out.println("You are a toddler");
	}else if (age>5 && age<=12) {
		System.out.println("You are a kid");
	}else if (age>=13 && age<=19) {
		System.out.println("You are a teenager");
	}else if (age>=20) {
		System.out.println("You are a adult");
	}else {
		System.out.println("Invalid age");
	}
		
		
		
		
		
		
		
		
		
		
	}

}
