package com.class14;

public class SpiltMethod {

	public static void main(String[] args) {
		
		/*
		 * .Split
		 * 
		 *this method splits this string around matches if 
		 *the given regular expression
		 */
		
		//Split the following string into array of strings/word
		String str ="This is a very difficult class";
		
		String [] array=str.split("\\s");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
		//How can we find how many sentences are in the following string;
		String str1="Today is Sunday. It's sunny day. and we are having java class";
		
		String [] array2=str1.split("\\.");
		for (String string:array2) {
			System.out.println(string.trim());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
