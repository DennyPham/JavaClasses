package com.class08;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		// Break
		// Breaks the loop
		for (int i = 0; 1 < 10; i++) {

			if (i == 7) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outside the loop");

		// Continue -it will skip Current iteration
		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}

		// i want to print numbers from 1-20 except 5,6,7

		for (int i = 1; i <= 20; i++) {
			if (i == 5 || i == 6 || i == 7) {
				continue;
			}
			System.out.println(i);

		}
		
		for (int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
			Scanner input=new Scanner (System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Apply for a credit card");
			String word=input.nextLine();
			if(word.equalsIgnoreCase("yes")) {
				break;
			}
		}
		System.out.println("Thank you");
	
		System.out.println("---------------------------");
	
		
	
		for (int i=1; i<=3; i++){			
			
			System.out.println(i);
			
			for(int y=1; y<=3; y++){
				System.out.println(y);
			}
		}
	
	
	
	
	
	
	
	
	}

}
