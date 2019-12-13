package com.class34;

import java.util.*;

public class SetFamilyMembers {

	public static void main(String[] args) {
		
		Set<String> fruitSet=new LinkedHashSet<>();
		fruitSet.add("Apple");
		fruitSet.add("Banana");
		fruitSet.add("Kiwi");
		fruitSet.add("Grape");
		fruitSet.add("Pinapple");
		fruitSet.add("Banana");
		
		System.out.println(fruitSet.size());
		System.out.println(fruitSet);
		
		
		
		Set<String> fruitset=new TreeSet<>();
		
		fruitset.add("Apple");
		fruitset.add("Banana");
		fruitset.add("Kiwi");
		fruitset.add("Grape");
		fruitset.add("Pinapple");
		fruitset.add("Banana");
		
		System.out.println(fruitset.size());
		System.out.println(fruitset);
		
	}

}
