package com.class17;

public class ObjectOfCarClass {

	public static void main (String args []) {
		//to create an object syntax is 
		//ClassName variable=new ClassName
		//Scanner input=new Scanner (System.in);
		//String str= new String();
		Car car1=new Car();
		car1.make="Lambo";
		car1.model="Urus";
		car1.color="White";
		car1.year=2019;
		car1.wheels=4;
		car1.windows=6;
		car1.speed=160;
		car1.drive();
		car1.start();
		car1.accelerate();
		
		
		
		
		
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="I8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=180;
		car2.drive();
		car2.accelerate();
		car2.start();
		//print features of the car
		//i have a Tesla
		System.out.println("I have a "+car1.color+" "+car1.make);
		System.out.println("I have a "+car2.make+" "+car2.year);
		
	}

}
