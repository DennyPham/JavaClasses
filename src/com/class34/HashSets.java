package com.class34;

import java.util.*;

public class HashSets {

	public static void main(String[] args) {
		// Create a collection of veggies where i dont't want 
		//to have duplicate
		//Hashsets order of the elements is not preserved
		HashSet<String> hset=new HashSet<>();
		//Storing values into HashSet
		hset.add("cucmber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		System.out.println(hset.size());
		System.out.println(hset);
		
		//They do not have any method to retrieve elements from the
		//the collection
		//examples: .get();, .set(); --> does NOT have
		
		
		//how can we retrieve all elements?
		//Iterator
		Iterator<String> it=hset.iterator();
		while (it.hasNext()) {
			String element=it.next();
			System.out.println(element);
		}
		System.out.println("-------------------");
		//Advance for loop
		for (String el:hset) {
			System.out.println(el);
		}
		
		
		
	}

}
