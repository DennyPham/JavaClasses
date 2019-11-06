package com.class10;

import java.util.Scanner;

public class HW4 {
public static void main (String args []) {
	
	Scanner input =new Scanner (System.in);
	int secretNumber, guessNumber;
	
	secretNumber=12;
	do {
		System.out.println("please guess my number from 1-20");
		guessNumber=input.nextInt();
		if(guessNumber<secretNumber) {
			System.out.println("Your number is too small");
		}else if (guessNumber>secretNumber) {
			System.out.println("Your number is too large");
		}else {
			System.out.println("Congrts you got it");
		}
	}while(guessNumber !=secretNumber);
}
}
