package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * Create an arrayList of car and retrieve all the valuse
		 * using 3 different ways
		 */

		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Honda");
		cars.add("Toyota");
		cars.add("Lexus");
		cars.add("Nissan");
		
		System.out.println("--- First Way ---");
		for (int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("---Second Way----");
		for(String obj:cars) {
			System.out.println(obj);
		}
		System.out.println("------Third Way-----");
		Iterator<String> it=cars.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
}
}


