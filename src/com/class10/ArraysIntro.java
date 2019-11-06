package com.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		int a;
		a=10;
		
		int a1=10;
		// 1 way
		int [] b; //Declare an array ---> preferred way
		
		int c []; 
		
		b=new int [4];
		// 2 way ---> all in one line (declaration and initialization)
		int[] array=new int [4];
		array [0]=10;
		array [1]=20;
		array [2]=30;
		array [3]=40;
		//access value from the value
		System.out.println(array[2]);
		//lets create an array that will store classes that we have
		
		String [] classes=new String [4];
		classes [0]= "Java";
		classes [1]= "SDLC";
		classes [2]= "Manual Testing";
		classes [3]= "GIT";
		//Today we have Java class
		System.out.println("Today we have "+ classes[0]+"class");
		
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how can i change 1 to 100
		nums[0]=100;
		
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);
		
		
		String[] names= new String[3];
		names[0]="Diana";
		names[1]="Seda";
		names[2]="Jaime";
		//names[3]="olga" during run time we will get an exception
		//ArrayIndexOutOfBoundException
		System.out.println(names[0]);
		
		//we are putting less elements inside
		//--> compiler will give default values
		int[] numbers=new int[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		
		//num.length will show you how many elements you have
		int[] num=new int[5];
		num[0]=12;
		num[1]=13;
		num[2]=14;
		num[3]=15;
		
		System.out.println(num.length);
							// 0	  1			2		3
		String [] arrays= {"Winter", "Fall","Summer","Spring"};
		//I was born in Summer
		System.out.println("I was born in the "+arrays[2]);
		//arrays.length will return an integer
		int arraysSize=arrays.length;
		System.out.println(arraysSize);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
