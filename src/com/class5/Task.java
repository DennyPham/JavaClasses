package com.class5;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		int day = 6;
		if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
			System.out.println("It's a weekday");
		} else if (day == 6 || day == 7) {
			System.out.println("It's the weekend");
		} else {
			System.out.println("Day is invalid");
		}
		// 2
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your height");
		int hei = input.nextInt();
		int height = hei / 12;
		if (height < 60) {
			System.out.println("Short");
		} else if (height > 60 && height < 72) {
			System.out.println("medium");
		} else if (height >= 73) {
			System.out.println("Tall");

		}
	}
}
