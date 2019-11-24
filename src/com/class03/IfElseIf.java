package com.class03;

public class IfElseIf {

	public static void main(String[] args) {
	
		int num1=100;
		int num2=100;
		
		if (num1>num2) {
			System.out.println("num1 is larger than num2");
		}else if(num1==num2) {
			System.out.println("num1 is equal num2");
		}else {
		System.out.println("num1 is smaller than num2");
		}
		
		int day=4;
		
		if(day==1) {
			System.out.println("today is monday. i have to go to work. ");
		}else if(day==2) {
			System.out.println("today is tuesday. i have SDLC class");
		}else if (day==3) {
			System.out.println("today is wendsday. i have java review class ");
		}else if (day==4) {
			System.out.println("today is thursday. i have SDLC class");
		}else if (day==5) {
			System.out.println("today is friday. i have to go to work");
		}else if (day==6) {
			System.out.println("today is saturday. my favorite coding day");
		}else if (day==7) {
			System.out.println("today is sunday. im at syntax");
		}else {
			System.out.println("i dont know what today is");
		}
		//Ctrl+Shift+F---> 
}
}