package com.class21;

public class Job {

	public static void main(String[] args) {
		Employees num1=new Employees();
		num1.eID=1233;
		num1.salary=9999;
		Employees.Ceo=" ";
		
		Employees num2=new Employees();
		num2.eID=3321;
		num2.salary=10000;
		Employees.Ceo="Dennis Pham";
		
		num1.display();
		num2.display();
	}

}
