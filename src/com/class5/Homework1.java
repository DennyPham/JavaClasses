package com.class5;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		
	Scanner exam=new Scanner(System.in);
	System.out.println("Please enter your Quiz score");
	int quiz=exam.nextInt();
	
	System.out.println("Please enter your Midterm score");
	int midterm=exam.nextInt();
	
	System.out.println("Please enter your Final score");
	int finals=exam.nextInt();
	
	int average=((quiz+midterm+finals)/3);
		
	if (average>=90) {
		System.out.println("You got an A Good Job!");
	}else if (average>=70 && average<90) {
		System.out.println("You got a B!");
	}else if (average>=50 && average<70) {
		System.out.println("You got a C!");
	}else if (average<50) {
		System.out.println("You got an D!");
	}else System.out.println("Unknown");
	System.out.println("Your average score is "+ average);
	
	
	
	
	
	// Problem 2
	
	boolean isRain=true;
	String Cmode="online";
	String Cmode2="In Class";
	
	if (isRain) {
		System.out.println("your class is "+ Cmode);
	}else {
		System.out.println("your class is "+ Cmode2);
	}
	
	
	
	
		
		

	}

}
