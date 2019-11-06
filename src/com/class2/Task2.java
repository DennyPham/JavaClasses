package com.class2;

public class Task2 {
	public static void main( String [] args) {
	
		double n1=13.5;
		double n2=2.1;
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		
		double sum=n1+n2;
		double sub=n1-n2;
		double div=n1/n2;
		double mult=n1*n2;
		
		System.out.println("The Addition of 2 numbers "+n1+" and "+n2+" is equal to "+ sum);
		System.out.println("The subtraction of 2 numbers "+n1+ " and "+n2+" is equal to "+ sub);
		System.out.println("The Division of 2 numbers "+n1+" and "+n2+" is equal to "+div);
		System.out.println("The Multiplication of 2 numbers "+" and "+n2+" is equal to "+mult);
		
		double n3=3.9;
		double areas=n3*n3;
		System.out.println("The Square of "+n3+ " is "+n3*n3);
		System.out.println(areas);
		
		int w=5;
		int h=8;
		int area=w*h;
		int per= 2*(w+h);
		System.out.println("The perimeter of a rectangle with width "+w+" and height of "+h+" is equal "+per+" and the area is "+area);
		
		String message="The perimeter of a rectangle with width "+w+" and height of "+h+" is equal "+per+" and the area is "+area;
		System.out.println(message);
		
	}

}
