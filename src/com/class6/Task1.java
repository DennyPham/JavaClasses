package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * ask user to enter boolean value for sale if no sale --> i am not shopping if
		 * sale --> check price of the item based on the amount we will have to
		 * calculate the price after discount if price <$20--> apply 10% if price
		 * between 20-100 ---> 20% if between 100-500 ---> 30% anything else ----> 50%
		 * 
		 * After discount _____ the price of the item reduced from ____ to _____
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Is there a sale today");
		boolean sale = input.nextBoolean();
		double price;
		double price2;
		double dis;

		if (!sale) {
			System.out.println("I am not shopping");
		} else {
			System.out.println("Enter the price of the item");
			price = input.nextDouble();
			if (price < 20) {
				dis = 10;
				price2 = price - (price * 10 / 100);
			} else if (price >= 20 && price < 100) {
				dis = 20;
				price2 = price - (price * 20 / 100);
			} else if (price >= 100 && price < 500) {
				dis = 30;
				price2 = price - (price * 30 / 100);
			} else {
				dis = 50;
				price2 = price - (price * 50 / 100);
			}
			System.out.println(
					"After discount % " + dis + " the price of the item reduce from " + price + " to " + price2);
		}

	}

}
