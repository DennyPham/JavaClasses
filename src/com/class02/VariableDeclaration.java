package com.class02;

public class VariableDeclaration {
	public static void main (String[]args) {
		
		// 1.declaring variable num1 that will hold value of "int" 
		// and assigning/initializing value on 123 to it
		int num1=123;
		int num2=6767;
		long num3=78687684242l;
		char num4='a';
		
		// 2. Declare variable first and then assign value
		int n1;
		int n2;
		int n3;
		n1=56;
		n2=7676;
		n3=767;
		
		//3.declare all variables together and then assign value 
		int number1, number2, number3;
		
		number1=12;
		number2=15;
		number3=676;
		
		number3=1000;
		System.out.println(number3);
		
		boolean var=true;
		System.out.println(var);
		
		char myVariable;
		myVariable='*';
		System.out.println(myVariable);	
		
		number2=number1;//12
		System.out.println(number2);
		
		//number2=false;--> compiler asking to change datatype of
		//variable "number2" to "boolean"
		
		boolean isRain=false;
		boolean isSnow;
		isSnow=isRain; //isSnow=false
		System.out.println(isSnow);
		isSnow=true;
		System.out.println(isSnow);
		
		
	}
}
