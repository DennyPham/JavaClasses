package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*ask use to enter name 5 times
		 * and out output should be "Good afternoon ________"
		 */
		
		
		Scanner input=new Scanner (System.in);
		int i=1;
		
		while(i <= 5) {
			
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		
		System.out.println("Good Aftternoon "+ name);
		i++;
		}
	
	}

}
