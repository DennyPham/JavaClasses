package com.class20;

public class Task {
	
protected String reverseString(String str) {
	String str1="";
	for(int i=str.length()-1;i>=0;i--) {
		str1=str1+str.charAt(i);
	}
	
	return str1;
				

	}
public boolean isPallindrome(String str) {
	boolean result=false;
	String reversed= reverseString(str);
	if(str.equalsIgnoreCase(reversed)) {
		result=true;
	}else {
		result=false;
	}
	return result;
}
private	String [] arrayOfWords(String str) {
		String [] stringArray=str.split(" ");
		return stringArray;
		
	}
public static void main (String args []) {
	
	String str="racecar";
	Task task=new Task();
	String result=task.reverseString(str);
	System.out.println(result);
	
	
	
	
	boolean result2=task.isPallindrome(str);
	System.out.println("Is "+str+" palindrom? "+result2);
	
	String[] strArray=task.arrayOfWords("What a beautiful day is today");
	System.out.println("The length of the array is: "+strArray.length);
	for (String word : strArray) {
	System.out.println(word);
	}	
}
}
