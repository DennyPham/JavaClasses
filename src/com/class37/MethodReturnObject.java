package com.class37;

import java.util.*;

public class MethodReturnObject {

	public static void main(String[] args) {
		//Create a method that will return an Object
		List<String>list=returnList("Java", "My favorite subject");
		System.out.println(list);
	}
	
	//Create a method that will return an Object of Scanner class
	public static Scanner returnScanner() {
		
		Scanner scan=new Scanner(System.in);
		return scan;
	}
	//Create a method that will return an Object of ArrayList class
	public static List<String> returnList(String str, String str1) {
		List <String> list=new ArrayList<>();
		list.add(str);
		list.add(str1);
		
		return list;
	}
	// Create a method that return an Object of Map class
	public static Map<String, String> returnMap(String key, String value, String key1, String value1) {
		Map<String, String> map=new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		
		return map;
	}
}
