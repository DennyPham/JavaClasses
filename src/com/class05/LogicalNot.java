package com.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b1 = !true;
		boolean b2 = !false;
		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = true;

		if (!traffic) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}

		boolean isRain = false;
		if (!isRain) {
			System.out.println("Take umbrella");
		} else {
			System.out.println("Dont take");
		}
		int num1 = 10;
		int num2 = 10;
		if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("numbers are not equal");
		}
		if (!(num1 == num2)) {
			System.out.println("numbers are not equal");
		} else {
			System.out.println("numbers are equal");
		}
		// if name is not Mary or Anna then you are not my sister
		String name = "Helen";
		String name2 = "July";

		if (!(name.equals("Mary") || name2.equals("Anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister");
		}

	}

}
