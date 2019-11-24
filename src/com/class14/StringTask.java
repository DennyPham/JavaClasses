package com.class14;

import java.util.Scanner;

public class StringTask {

	public static void main(String[] args) {
		// lets ask user to enter browser
		// based on the input we say "your selected browser is " ______
		
		Scanner input=new Scanner (System.in);
		System.out.println("Please enter browser name ");
		String browser=input.nextLine();
		
		switch (browser.toLowerCase()) {
		case "firefox":
			System.out.println("Execution be performed on "+browser);
			break;
		case "chrome":
			System.out.println("Execution be performed on "+browser);
			break;
		case "ie":
			System.out.println("Execution be performed on "+browser);
			break;
		case "safari":
			System.out.println("Execution be performed on "+browser);
			break;
		default:
			System.out.println("Please enter valid browser");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
