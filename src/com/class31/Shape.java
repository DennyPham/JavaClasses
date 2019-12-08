package com.class31;

public interface Shape {
	double calcuateArea(double w, double l);
	double calcuatePerimeter();
	
}
class Circle implements Shape{

	
	public double calcuateArea(double w,double l) {
		return w*l;
		
	}

	
	public double calcuatePerimeter() {
		return 
	}
}
class Square implements Shape{

	
	public double calcuateArea(double w,double l) {
		return w*l;
	}

	
	public double calcuatePerimeter(double w,double l) {
		return (2*w)+(2*l);
	}
	
}
