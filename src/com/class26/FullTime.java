package com.class26;

public class FullTime extends Employee {

	public int bonus;
	
	public void getPaid() { //Overriding!
		System.out.println("Full time employee gets paid "+salary+" and bounus of "+bonus);
	}
}
