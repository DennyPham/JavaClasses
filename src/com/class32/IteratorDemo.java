package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> nameList=new ArrayList<>();
		nameList.add("Dennis");
		nameList.add("Alvin");
		nameList.add("Bobby");
		nameList.add("Kevin");
		nameList.add("Jane");
		
		//retrieve alues from an ArrayList
		//1 -for loop
		for (int i=0;i<nameList.size();i++) {
			System.out.println(nameList.get(i));
		}
		//2- using enhanced for loop
		for (String name:nameList) {
			System.out.println(name);
		}
		//3- using Iterator
		
	}

}
