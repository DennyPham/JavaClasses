package com.class08;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		for (int i=20; i>=2; i-=2) {
			System.out.println(i);
		}
		for (int i=20; i<=49; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	
		int sum=0;
        for(int i=1; i<=5; i++) {
            sum = sum+i;
            System.out.println(sum+ "+");
        }
        System.out.println();
        System.out.println(sum);
        
        int sumAll=0;
        
        for (int i=0; i<=20; i+=5) {
            sumAll=sumAll+i;
        }
        System.out.println(sumAll);
    }
		
		
		
		
		
	}
