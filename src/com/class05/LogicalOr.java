package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		/*7 days a week
		 * if days is 2 or 4 --> SDLC
		 * if day is 6 or 7 --> Java
		 * if day is 1 or 5 --> Working
		 * if day is 3 --> review class
		 */
		
		int day=7;
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		}else if (day==1 || day==5) {
			System.out.println("Working");
		}else if (day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("not a valild day");
		}

	}

}
