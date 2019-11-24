package com.class04;

public class IfElseRecap {

	public static void main(String[] args) {

		/*
		 * class scheduel if tuesday ---> SDLC if thursday ---> Sdlc if wendsday ---->
		 * Java Review if saturday --->Java coding if sunday ---> my favorite java
		 * coding
		 */

		int day = 17;
		if (day == 2) {
			System.out.println("SDLC class");
		} else if (day == 3) {
			System.out.println("Java Review");
		} else if (day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6) {
			System.out.println("Java coding");
		} else if (day == 7) {
			System.out.println("Favorite coding class");
		} else {
			System.out.println("There is no school");
		}

	}

}
