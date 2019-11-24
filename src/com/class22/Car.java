package com.class22;

public class Car {
		/*we want to build make as Toyota
		 * that will have different models and color
		 */
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {
		System.out.println("I built a "+color+" "+make+" "+model);
		System.out.println("My car can have speed up to "+speed);
	}
	public static void main(String[] args) {
		Car car1=new Car();
		Car.make="Toyota";
		car1.model="Corolla";
		car1.color="Black";
		
		Car car2=new Car();
		car2.model="Camary";
		car2.color="Blue";
		
		car1.getDetails();
		car2.getDetails();
	}

}
