package com.class11;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		int [] array1= {2,5,4,7,2};
		
		for (int i = 0; i < array1.length; i++) {
			for(int j=i+1;j<array1.length;j++) {
				if (array1[i]==array1[j]) {
					System.out.println(array1[j]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
