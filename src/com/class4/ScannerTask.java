package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println(" Amount of loan needed is ");
		double d=keyboard.nextDouble();
		if (d<200000) {
			System.out.println("You would lend money");
		}else {
			System.out.println("You would reject the client");
		}
		
		System.out.println("-------------------------");
		
		//Task2
		System.out.println("What is your age");
		int age=keyboard.nextInt();
		if(age>=18) {
			System.out.println("You will issue a driver license to them");
		}else {
			System.out.println("You will offer them to get a lerners permit");
		}
		System.out.println("-------------------");
		
		
		//Task3
		Scanner keyboard1=new Scanner (System.in);
		System.out.println("Enter Temperature");
		double temp=keyboard.nextDouble();
		
		
		Scanner sin=new Scanner(System.in);
		System.out.println("What city are you from?");
		String city=sin.nextLine();
		
		
		
		double temp2=(temp-32)*0.556;
		System.out.println("The temp of "+city+" is "+ temp2);
		
		
		
		
		
		
		
		
		
		
	}

}
