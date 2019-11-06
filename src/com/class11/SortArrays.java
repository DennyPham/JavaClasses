package com.class11;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		
	String [] actualNames = {"John","Smith","Alex","Tanez"};
	Arrays.sort(actualNames);
	
	String [] expectedNames= {"Smith","John","Alex","Tanez"};
	Arrays.sort(expectedNames);
	//To sort the element of an Array
	
	Arrays.sort(expectedNames);
	
	int [] numbers= {100,43,103,213};
	Arrays.sort(numbers);
	for (int i:numbers) {
		System.out.print(i+" ");
	}
	System.out.println();
	
	
	
	}
		
}
