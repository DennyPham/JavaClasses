package com.class32;

public class Recap {

	public static void main(String[] args) {
		// Store single value
		int num=10;
		
		//to store multiple values
		int [] array= {10,20,30};
		
		int [] arr=new int[3];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		
		System.out.println(arr[2]);
		
		//to retrieve all values 1 by 1
		for(int nums:arr) {
			System.out.println(nums);
		}
		//using loop
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//we can store non-primitive types: Objects
		Fruit obj=new Apple();
		Fruit obj1=new Banana();
		Object obj2=new Orange();
		Object monkey=new Monkey();
		
		
		Object [] mixArray= {obj,obj1,obj2,monkey};
		for (Object ff:mixArray) {
			System.out.println(ff);
		}
		
		
		
}
}
class Monkey extends Object{
	
}
class Fruit extends Object{
	
}
class Apple extends Fruit{
	
}
class Orange extends Fruit{
	
}
class Banana extends Fruit{
	
}
