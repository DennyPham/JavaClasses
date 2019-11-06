package com.class10;

public class Task {
public static void main (String args[]) {
	
	char[] grades= {'A','B','C','D','E','F'};
	System.out.println(grades[1]);
	
	String[] name= {"Harman", "Jai", "Marcelo","Uddhab","Dennis"};
	System.out.println(name[4]);
	
	String[] word= {"JAVA","Saturday","Day","Coding","Is"};
	System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
	
	// print all animals on one line
	String[] animals= {"cat", "dog", "cow", "Snake", "elephant"};
	int size=animals.length;
	
	for (int i=0; i<size; i++) {
		System.out.println(animals[i]+" ");
	}
	
	//create and array of 5 doubles values on one line
	
	double [] num= {1.0,2.0,3.0,4.0,5.0};
		int sizes=num.length;
		
		for (int i=0; i<sizes; i++) {
			System.out.print(num[i]+"  ");
		}
	
		
		
	
	
	
	
	
	
	
	
	
	
}
}
