package com.class18;

public class Hello {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
	Hello obj= new Hello();
	obj.sayHello("Dennis");
	obj.sayHello("Marcelo");		
	obj.sayHello("God");
	obj.sayHelloDifferentLanguage("Albania");
	obj.sayNameAndAge("Dennis", 20);
	obj.isSnow(true);
	obj.isSnow(false);
	
	
	}
	/*Create a method that will say hello in different
	 * languages based on the value that will be passes 
	 * when user calls a method
	 */
	void sayHelloDifferentLanguage(String country) {
		
		switch (country) {
		case "USA":
			System.out.println("Hello");
		break;
		case "Russia":
			System.out.println("Privet");
		break;
		case "Paraguay":
			System.out.println("Hola");
		break;
		case "Albania":
			System.out.println("Pershendetje");
		break;	
		default:
				System.out.println("I do not know how to say hello in your language");
		}
	}
	void sayNameAndAge(String name, int age) {
		System.out.println("My name is "+name+" and I am "+age+" years old");
	}
	//create a method that will check if it snowing
	//if snow --> stay at home, otherwise go for a walk
	
	void isSnow(boolean isSnow) {
		
		if(isSnow) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
	}
	
	
}
