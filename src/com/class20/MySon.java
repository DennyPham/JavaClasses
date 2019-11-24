package com.class20;

public class MySon {
	String name;
	void add1() {
		int num1=2;
		int num2=1;
		int result=num1+num2;
	}
	void add2(int num1, int num2) {
		int result= num1+num2;
		
	}
	int add3() {
		int num1=2;
		int num2=2;
		int result=num1+num2;
		
		return result;
	}
	int add4(int num1, int num2) {
		int result=num1+num2;
		return result;
	}
	boolean checkResult(int myResult, int mySonResult) {
		boolean isOK= false;
		if(myResult==mySonResult) {
			isOK=true;
		}else {
			isOK=false;
		}
		return isOK;
	}
	public static void main(String[] args) {
		

	}

}
