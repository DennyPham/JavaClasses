package com.class34;

import java.util.*;

public class SetFamilyMembers {

	public static void main(String[] args) {
		// create a collection that wont allow duplicates and preserve
		//the insertion order
		Set<String> fruitSet=new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		
		//create a collection that wont allow duplicates and is in
		//accending order [0-9,A-Z]
		Set<String> fruitset=new TreeSet<>();
		
		fruitset.add("Apple");
		fruitset.add("Banana");
		fruitset.add("Kiwi");
		fruitset.add("Grape");
		fruitset.add("Pinapple");
		fruitset.add("Banana");
		
		System.out.println(fruitset.size());
		System.out.println(fruitset);
		
		Set<Integer> tset=new TreeSet<>();
		tset.add(10000);
		tset.add(100);
		tset.add(2);
		tset.add(30);
		tset.add(2);
		
		System.out.println(tset.size());
		System.out.println(tset);
		System.out.println();
		
		//Adding collection into a collection
		List<String> list=new ArrayList<>();
		list.add("Java");
		list.add("Selenium");
		list.add("testNG");
		
		Set<String> linkedSet=new LinkedHashSet<>();
		
		linkedSet.addAll(fruitset);
		linkedSet.addAll(list);
		
		System.out.println("------Object from both collection");
		System.out.println(linkedSet);
		
	}

}
