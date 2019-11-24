package com.class19;

public class TestOfMethods {
	

	public static void main(String[] args) {
		//find the largest number from 300-500
		//then identify if the largest number is odd

		AllMethod obj=new AllMethod();
		int largest=obj.findLargest(300, 500);
		System.out.println(largest);
		boolean num=obj.isOdd(largest);
		System.out.println(num);
		
		//Call method weekDayName
		//if (tuesday || wendsday || thursday || saturday || sunday)
		// i am learning java
	String	day =obj.weekDayName(5);
		System.out.println(day);
		if (day.equals("Tuesday")||day.equals("Wednsday")||
				day.equals("Thursaday")||day.equals("Saturday")||
				day.equals("Sunday")) {
			System.out.println("I am learning Java");
		}else {
			System.out.println("I am practicing Java");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
