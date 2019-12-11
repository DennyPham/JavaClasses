package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		//Generic
		ArrayList<String> nameList=new ArrayList<>();
		nameList.add("Dennis");
		nameList.add("Alvin");
		nameList.add("Bobby");
		nameList.add("Kevin");
		nameList.add("Jane");
		System.out.println(nameList.isEmpty());
		for(String num:nameList) {
			System.out.println(num);
		}
		System.out.println(nameList.size());
		System.out.println(nameList.contains("Dennis"));

	//ArrayList can Generic and non-Generic
	//Non Generic
		ArrayList<Object> alist=new ArrayList<>();
		alist.add("Hello");
		alist.add(100);
		alist.add(10.10);
		alist.add(true);
		alist.add('c');
		
		System.out.println(alist);
		
		ArrayList<Double> list=new ArrayList<Double>();
		list.add(100.10);
	}	
}
