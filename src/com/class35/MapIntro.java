package com.class35;
import java.util.*;
public class MapIntro {

	public static void main(String[] args) {
		HashMap<Integer, String>map=new HashMap<>();
		//to store key+values pair into map
		map.put(101, "John");
		map.put(102, "James");
		map.put(103, "Jane");
		map.put(104, "Jacky");
		
		System.out.println(map);
		//how to verify if there is any element inside the map
		boolean flag=map.isEmpty();
			if(!flag) {
				int size=map.size();
				System.out.println(size);
			}
			
		//I want to add more entry Objects
		//adding duplicate values
		map.put(105, "John");
		System.out.println(map);
		//adding duplicate keys --> overrides we connot have duplicate keys
		map.put(102, "Hasan");
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		
		//to replace or update the value
		map.replace(103, "Dennis");
		System.out.println(map);
		
		//how to verify if certain value exist
		boolean contains=map.containsValue("Dennis");
		System.out.println(contains);
		System.out.println(map);
		
		
		
		
		
		
		
		
	}

}
