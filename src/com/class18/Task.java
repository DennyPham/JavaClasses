package com.class18;

public class Task {

	void largestnum(int one, int two) {
		int max;
		if(one>two) {
			max=one;
		}else {
			max=two;
		}
		System.out.println("This is the largest "+max);
	}
	
	void evenOrOdd(int num) {
		if(num%2==0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
	}
	void palindrome(String str) {
		char[] c1=str.toLowerCase().toCharArray();
		char [] c2=new char [c1.length];
		
		for (int i=0;i<c1.length;i++) {
			c2[i]=c1[c1.length-1-i];
		}
		String sc1=new String (c1);
		String sc2=new String (c2);
		
		if (sc1.equals(sc2)) {
			System.out.println(str+" is a palindrom word");
		}else {
			System.out.println(str+ "is not a palindrome word");
		}
	}
	
	
	
	
	public static void main (String args []) {
		Task max=new Task();
		max.largestnum(10, 8);
	
		Task nums=new Task();
		nums.evenOrOdd(5);
		
		
		Task word= new Task();
		word.palindrome("boob");
	
	
	
	
	
	
	
	
	}	
}
