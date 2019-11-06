package com.class9;

public class Pattern {

	public static void main(String[] args) {
	
		for (int r=1;r<=5;r++){
			for (int c=5;c>=1;c--) {
			System.out.print(c);
		}
		System.out.println();
	}
	System.out.println("+++++++++++++++++++++++++");
	for (int h=5;h>=1;h--) {
		for (int v=5; v>=1;v--) {
			System.out.print(h);
		}
		System.out.println();
	}
	
	
	
	for (int r=1; r<=5; r++) {
		for (int c=1;c<=r; c++) {
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("================");
	for (int r=1;r<=5;r++) {
		for (int c=r;c<=5;c++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	System.out.println("...........................");
	for (int r=1;r<=9;r++) {
		for (int c=1; c<=r;c++) {
			System.out.print(r);
		}
		System.out.println();
	}
	
	System.out.println("----------------------------");
	for (int r=9;r>=1;r--) {
		for (int c=r;c>=1;c--) {
			System.out.print(r);
		}
		System.out.println();
	}
	}

}
