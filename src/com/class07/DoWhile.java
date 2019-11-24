package com.class07;

public class DoWhile {

	public static void main(String[] args) {
//Mostly used
		int num = 1;

		while (num <= 7) {

			System.out.println("Hello");
			num++;
		}
//Rare
		int num1 = 1;

		do {

			System.out.println("Bye");
			num1++;
		} while (num1 <= 7);
		
		//print even numbers from 20-50 using "Do While"
		int n=20;
		do {
		
			System.out.println(n);
			n+=2;
			}while(n<=50);
		int n1=20;
		do {
			if (n1%2==0) {
				System.out.println(n1);
			}
			n1++;
		}while (n1<=50);
		
	}
}
