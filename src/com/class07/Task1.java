package com.class07;

public class Task1 {

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		while (workDay &&  day<6) {
			System.out.println("I need a day off");
			day++;
		}
		System.out.println("I do not need a day off anymore");
		
		System.out.println("----------------------");
		// 2 way to do this
		boolean workDays=true;
		int d=1;
		while (workDays) {
			
		if (d==6) {
			System.out.println("I do not need a day off anymore");
			workDays=false;
		}else {
			System.out.println("I need a day off");
		}
		d++;
		}
		
		
		
		
		
	}

}
