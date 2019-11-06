package com.class11;

public class Task {
public static void main (String args []) {
	String [] cars= {"BMW","Toyota","Nissan","Honda","Kia","Jeep"};
	for (String i : cars) {
		System.out.println(i);
	}
	for (int k=0;k<cars.length; k++) {
		System.out.println(k);
	}
	
	//2
	int [] nums= {1,2,3,4};
	int sumofArray=0;
	for (int i=0; i<nums.length;i++) {
		sumofArray=sumofArray+nums[i];
	}
	System.out.println(sumofArray);
	
	
	//3
	
}
}
