package com.class19;

public class AllMethod {
	/*
	 * create methods to return value of sum
	 * sub
	 * mult
	 * div
	 */
	int sum(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	int sub(int num1, int num2) {
		int sub=num1-num2;
		return sub;
	}
	int mult(int num1, int num2) {
		int mult=num1*num2;
		return mult;
	}
	int div(int num1, int num2) {
		int div=num1/num2;
		return div;
	}
	int findLargest(int num1,int num2) {
		int largest;
		if(num1>num2) {
			largest=num1;
		}else {
			largest=num2;
		}
		return largest;
	}
//Method to return if number is odd	
	boolean isOdd(int num) {
	boolean	isOdd;
		if(num%2!=0) {
			isOdd=true;
		}else {
			isOdd=false;
		}
		return isOdd;
	}
	/**
	 * method will take a weed day number and return
	 * a weekday name
	 */
	String weekDayName(int weekDay) {
		String weekDayName;
		switch (weekDay) {
		case 1:
			weekDayName="Monday";
		break;
		case 2:
			weekDayName="Tuesday";
		break;
		case 3:
			weekDayName="Wednsday";
		break;
		case 4:
			weekDayName="Thursday";
		break;
		case 5:
			weekDayName="Friday";
		break;
		case 6:
			weekDayName="Saturday";
		break;
		case 7:
			weekDayName="Sunday";
		break;
		default:
			weekDayName="Unknown";
		break;
		}
		return weekDayName;
	}
	public static void main(String[] args) {
		

	}

}
