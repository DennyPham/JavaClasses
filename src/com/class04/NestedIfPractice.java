package com.class04;

public class NestedIfPractice {

	public static void main(String[] args) {

		boolean isFriday = true;
		int day = 1311;

		// if today is friday only day i want to check if it day id 13

		if (isFriday) {
			System.out.println("Today is Friday");
			if (day == 13)
				;
			{
				System.out.println("I will go watch a scary movie");
			}  {
				System.out.println("I will watch comedy");
			}
		} else {
			System.out.println("Today is NOT Friday");
		}

	}

}
