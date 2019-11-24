package com.class14;

public class IQ6 {
	public static void main (String args []) {
		
		/*
		 * Logic
		 * Step1: reverse the string
		 * Step2: compare 2 String:
		 * 		  if string are equal->palindrome
		 * 		  else --> not palindrome
		 */
		
		String original="boob";
		String reversed="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k+a=ka+k
		}
		System.out.println(reversed);
		
		if (original.contentEquals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
		
		
		
		
		
		
		
		
	}
}
