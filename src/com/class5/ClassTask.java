package com.class5;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter the month you were born");
		String month=input.nextLine();
		
		String season="";
		
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season= "winter";
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season="Spring";
		}else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season= "Summer";
		}else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season="Fall";
		}else {
			season= "Unknown";
		}
		
		System.out.println("You wer born in the " + season);
		
		
		
		
		
		
	}

}
