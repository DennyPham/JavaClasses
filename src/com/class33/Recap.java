package com.class33;

import java.util.ArrayList;
import java.util.Iterator;


public class Recap {

	public static void main(String[] args) {
		//Create an ArrayList to store numbers
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(10);
		numbers.add(100);
		numbers.add(1000);
		int size=numbers.size();
		System.out.println(size);
		
		//add more
		numbers.add(10000);
		//remove
		numbers.remove(2);
		numbers.remove(1);
		System.out.println(numbers);
		
		//retrieve value from an ArrayList
		int element=numbers.get(0);
		System.out.println(element);
		
		//1.for loop
		for (int i=0;i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		//2. Advance loop
		for(Integer num:numbers) {
			System.out.println(num);
		}
		System.out.println("----------------");
		//I want to get values backwords
		for(int i=numbers.size()-1;i>=0;i--) {
			System.out.println(numbers.get(i));
		}
		
		//3. using Iterator
		Iterator<Integer> iterator=numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
