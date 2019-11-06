package com.class7;

public class WhileLookPractice {

	public static void main(String[] args) {
		// how to print numbers 1-20

		int i = 1;

		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		// i want to print numbers from 10-30
		int y = 10;
		while (y <= 30) {
			System.out.print(y + " ");
			y++;
		}
		// how to print values from 10-1
		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		int b = 50;
		while (b >= 20) {
			System.out.println(b);
			b--;
		}
		// i want to print only even number from 1-20
		// 1st way
		int z = 2;
		while (z <= 20) {
			System.out.println(z);
			z += 2;
		}
		// 2nd way using modulus
		int q = 2;
		while (q <= 20) {
			if (q % 2 == 0) {
				System.out.println(q);

			}
			q++;
		}
		int t = 50;
		while (t <=100) {
			if (t%2!= 0) {
				System.out.println(t);
				}
			t++;
		}
 
	}
}
