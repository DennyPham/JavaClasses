package com.class21;

public class Aircrafts {
	int passengers;
	int cruiseSpeed;
	double fuelCapacity;
	double fuelBurnRate;
	String name;
	
	 Aircrafts(int p,int cs, double fc, double fbr,String n) {
		 passengers=p;
		 cruiseSpeed=cs;
		 fuelCapacity=fc;
		 fuelBurnRate=fbr;
		 name=n;
	 }
		
	
	
	
	public static void main(String[] args) {
		Aircrafts b4747=new Aircrafts(10,100,98.09,100.00,"b474");
		Aircrafts c373=new Aircrafts(6, 34, 98.99, 123.321, "c373");
		
		
	}

}
