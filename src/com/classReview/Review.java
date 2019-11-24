package com.classReview;

public class Review {
int addition(int c, int d) {
	int add=c+d;
	System.out.println("Addition "+add);
	return add;
}
int substraction(int e, int f) {
	int sub=e-f;
	System.out.println("Subtraction "+sub);
	return sub;
}
public static void main (String args []) {
	Review a=new Review();
	a.addition(20, 10);
	
	a.substraction(40, 20);
}
}
