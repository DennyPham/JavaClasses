package com.class07;

public class Repl {

	public static void main(String[] args) {
		int valueOdd = 0;
		int valueEven = 0;
		for (int i = 0; i <= 20; i += 2) {

			valueEven = valueEven + i;

		}
		System.out.println(valueEven);

		for (int i = 1; i <= 20; i += 2) {
			valueOdd = valueOdd + i;

		}
		System.out.println(valueOdd);
	
	// 2nd way 
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=1; i<=20; i++) {
		if (i%2==0) {
			sumEven=sumEven+i;
		}else {
			sumOdd=sumOdd+i;
		}}
		
		
		System.out.println("The total sum of all even # " +sumEven);
		System.out.println("The total sum of all odd # " +sumOdd);
	
	
		
		
	
	
	
	
	}
}
