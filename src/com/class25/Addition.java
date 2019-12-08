package com.class25;
		// method overloading
		//1 by passing different amount of parameters
public class Addition {
	public void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	public void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	// 2 by having different types of parameters
	public double add (double num1, double num2) {
	double	sum=num1+num2;
		return sum;
	}
	public void add(int num1, double num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		Addition obj= new Addition();
		obj.add(12, 13);
		obj.add(12, 14, 13);
		obj.add(12.09, 12.10);
		
		
		String str="Hello";
		System.out.println(str.substring(3));
		System.out.println(str.subSequence(1, 3));
	}
}
