package com.class11;

public class Repel {
	public static void main(String[] args) {
	int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}
		};
int total=0;
for (int row=0; row<a.length;row++){
  for (int column=0; column<a[row].length;column++){
    if(a[row][column]<0&&a[row][column]%2!=0){
      total=total+column;
    }
  }
}
System.out.println(total);
	
	
	
		

		
		
		
	}


}
