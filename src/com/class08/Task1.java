package com.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		for (int r=5; r>=1;r--) {
			for (int c=r;c>=1;c--) {
				System.out.print(r);
			}
			System.out.println();
		}
	
	//Task 2
		for (int r=1;r<=5;r++) {
			for (int c=1;c<=r;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		for(int r=4;r>=1;r--) {
			for (int c=r; c>=1;c--) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	//Task 3
	/*
	 * Write a program that reads a range of integers (start and end point), 
	 * provided by a user and then from that range prints the 
	 * sum of the even and odd integers.
	 */
		
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Start point");
		int sPoint=input.nextInt();
		System.out.println("Enter End point");
		int ePoint=input.nextInt();
			int sumEven=0;
			int sumOdd=0;
		for(int i=sPoint;i<=ePoint;i++) {
			if(i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
	System.out.println("Sum of the even numbers: "+sumEven);
	System.out.println("Sum of the odd numbers: "+sumOdd);
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	}


