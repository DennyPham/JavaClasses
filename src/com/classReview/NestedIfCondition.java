package com.classReview;

import java.util.Scanner;

public class NestedIfCondition {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		boolean cc = input.nextBoolean();
		if (cc == true) {
				System.out.println("What is the balance on your card?");
				int balance = input.nextInt();
				if (balance > 1000) {
				System.out.println("Please pay off your balance");
				} else {
				System.out.println("You can spend more money");
			}

		
		} else {
			System.out.println("Would you like to apply for credit card");
		}

	}
}