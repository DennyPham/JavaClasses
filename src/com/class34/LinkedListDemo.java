package com.class34;

import java.util.*;

class Sweets{
	String name;
	public Sweets(String name) {
		this.name=name;
		
	}
	public void iLove() {
		System.out.println("I love  "+name);
	}
}
public class LinkedListDemo {

	
	public static void main(String[] args) {
		//create a lidt of Sweets Objects
		LinkedList<Sweets>sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolate"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookie"));
		sweetList.add(new Sweets("Ice Cream"));
		//display name of each sweet object
		for (Sweets element:sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//display 1 name of sweet object (2 steps)
		Sweets mySweet=sweetList.get(2);
		mySweet.iLove();
		//display 1 name of sweet object (1 steps)
		sweetList.get(2).iLove();
		
		String str="Hello 123 ";
		str.replace("123", "456").trim();
		
		Integer num=100;
		String newNumber=num.toString().replaceFirst("100", "200");
		System.out.println(newNumber);
		
		
		
		
		
		
		
		
}

}
