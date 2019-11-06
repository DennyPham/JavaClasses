package com.class11;

public class Arrays2D {

	public static void main(String[] args) {
		//Declare 2D Arrays
		
		int[][] num= {{1,2,3,0},
					  {4,5,6,0},
					  {7,8,9,0},
					  
					   };
	for (int [] k:num) {
		for (int m:k) {
			System.out.print(m+" ");
		}
		System.out.println();
	
	}
		
	
	
	for (int i=0; i<num.length;i++) {
		
		for (int j=0; j<num[i].length; j++) {
			System.out.print(num[i][j]+" ");
		}
		
		System.out.println();
	
	
	
	
	
	
	}
	}
}
