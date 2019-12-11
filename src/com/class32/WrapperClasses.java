package com.class32;

public class WrapperClasses {

	public static void main(String[] args) {
		
		int num=10;
		//Autoboxin-->converting primitive type into Object type
		Integer integer=100;
		System.out.println(integer.MIN_VALUE);
		System.out.println(integer.toString());
		//converting boolen primitive type into Boolean Object type
		Boolean	bool=true;
		Byte $b=20;
		System.out.println($b.MAX_VALUE);
		
		
		//Autoboxing --> converting Objects type into primitive types
		int num1=new Integer(10);
		System.out.println(num1);
		
	}

}
