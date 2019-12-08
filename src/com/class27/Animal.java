package com.class27;

public class Animal {
	public static void whoAmI() {
		System.out.println("I am an animal");
	}
}

class Monkey extends Animal{
	//cannot override static methods with instance method
	//public void whoAmI() {
	//
	//}
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
}
