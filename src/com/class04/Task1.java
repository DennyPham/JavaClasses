package com.class04;

public class Task1 {

	public static void main(String[] args) {
	//Task1
		
	boolean dip=true;
	double gpa=3.5;
		
		if (dip) {
			System.out.println("Congratulation");
			if (gpa>=3.5) {
				System.out.println("You are eligible for a scholarship");
			}else {
				System.out.println("You should've studied harder");
			}
		}else {
			System.out.println("You should get a degree");
		}
		System.out.println("-----------");
		//Task 2
		
		double rate=4.4;
		double price=2000001;
		
		if (rate>=4.5) {
			System.out.println("Will not buy a house");
		}else {
			System.out.println("Consider buying a house");
			if (price>200000) {
				System.out.println("Will take a loan");
			}else {
				System.out.println("Will pay cash");
			}
		}
		
		
		
		
		
		
		
		

	}

}
