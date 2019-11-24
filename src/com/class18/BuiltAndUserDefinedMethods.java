package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {

	public static void main(String[] args) {
		//built in methods
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner (System.in);
		boolean scannerString=scan.hasNextLine();
		System.out.println(scannerString);
		
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}
		void myMethod()//Method header 
		{//Method body
			System.out.println("This is user defined method that I created");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


