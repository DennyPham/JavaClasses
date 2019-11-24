package com.class07;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*you need to ask user to pay for coffee
		 * you need to keep asking her user to pay for it until 
		 * enter price is equal to 5
		 * after user paid  then say "Enjoy your coffee
		 */
		Scanner input=new Scanner (System.in);
		
		for (int i=1; i<=10; i++) {
			System.out.println("Apply for a credit card");
			String word=input.nextLine();
			if(word.equals("yes")) {
				break;
			}
		}
	
	
	
	
	
	}

}
