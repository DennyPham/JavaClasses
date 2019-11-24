package com.class19;

public class MethodsWithoutReturnValue {
	//return type, method name (list of parameter)
	int sum(int num1,int num2) {
		int c=num1+num2;
		return c;
	}
	//method to find the largest number
	int findLargest(int num3,int num4) {
		int largest;
		if(num3>num4) {
			largest=num3;
		}else {
			largest=num4;
		}
		return largest;
	}
	
	
	
	
	public static void main(String[] args) {
		/*
		 * declare a string
		 * if String has more than 10 characters ---> String is large
		 * otherwise --> String is small
		 */
		String str="Welcome home";
		int numOfChars=str.length();
		if (numOfChars>=10) {
			System.out.println("String is large");
		}else {
			System.out.println("String is small");
		}
		char character=str.charAt(4);
		System.out.println(character);
		
		//create an object of the class where method is defined
		
		Recap obj=new Recap();
		obj.sum(50, 50);
		//int num=obj.sum(10, 30);Compiler error saying change return type
		
		MethodsWithoutReturnValue obj1=new MethodsWithoutReturnValue();
		int sum=obj1.sum(50, 50);
		System.out.println(sum);
		
		int Large=obj1.findLargest(150, 99);
		System.out.println(Large);
		
		
		
		
		
		
		
	}

}
