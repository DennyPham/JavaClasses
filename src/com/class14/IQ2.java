package com.class14;

import java.util.Arrays;

public class IQ2 {

	public static void main(String[] args) {
		
		int [] array= {100,-90, 8787, 898, 0, 1};
		//1 easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		
		//2nd way
		int [] myArray= {100,-90, 8787, 898, 0, 8787};
		int largest=myArray[0];
		int smallest=myArray[0];
		
		for(int i=0; i<array.length; i++) {
			
			if (myArray[i]>largest) {
				largest=myArray[i];
			}
			if(myArray[i]<smallest){
				smallest=myArray[i];
		}
		}
		System.out.println(smallest);
		System.out.println(largest);
		
		
		int [] nums= {100,-90, 8787, 898, 0, 1, -90};
		int large=nums[0];
		int secondlarge=nums[0];
		
		for (int i=0; i<nums.length; i++) {
			if (nums[i]>large) {
				secondlarge=large;
				large=nums[i];
			}
			if (nums[i]>secondlarge) {
				
			}
		}
		
		
		
			

		}}

	
