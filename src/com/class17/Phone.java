package com.class17;

public class Phone {
	String brand, color;
	int price,size;
	
	void talk() {
		System.out.println("I can talk on my "+color+" "+brand);
	}
	


public static void main (String args []) {
	Phone p1=new Phone();
		p1.brand="iPhone";
		p1.color="Blue";
		p1.price=700;
		p1.size=20;
	
	Phone p2=new Phone();
		p2.brand="Android";
		p2.color="Grey";
		p2.price=250;
		p2.size=18;
		
	Phone p3=new Phone();
		p3.brand="Nokia";
		p3.color="Bue and Grey";
		p3.price=5;
		p3.size=10;
		
	p1.talk();
	p2.talk();
	p3.talk();
	
}
}