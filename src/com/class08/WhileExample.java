package com.class08;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		/*
		 * let's ask user to enter if it is raining or not (True or False)
		 * as long as there is rain lets keep asking
		 * as soon as there is no rain ---> you can go to the park
		 */
		
		Scanner input;
		boolean isRain;
		input=new Scanner (System.in);
		do {
			System.out.println("Is it raining?");
			isRain=input.nextBoolean();
			
			
		}while (isRain);
		System.out.println("Go to the park");
	}

}
