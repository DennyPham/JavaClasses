package com.class17;

public class Dog {
	String type;
	int age;
	
	void Love() {
		System.out.println("I love my "+age+" year old "+type);
	}

	public static void main(String[] args) {
		Dog d1=new Dog();
			d1.type="Husky";
			d1.age=14;
		Dog d2=new Dog();
			d2.type="Bulldog";
			d2.age=12;
		Dog d3=new Dog();
			d3.type="Labrador";
			d3.age=2;
			
		d1.Love();
		d2.Love();
		d3.Love();

	}

}
