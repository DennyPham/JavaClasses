package com.class34;
import java.util.*;
public class IteratorUsage {

	public static void main(String[] args) {
		
		
		List<String> stringList=new ArrayList<>();
		stringList.add("Dennis");
		stringList.add("Donald");
		stringList.add("Jacky");
		stringList.add("Kim");
		stringList.add("Sam");
		stringList.add("Alex");
		stringList.add("Daniel");
		
		//best way to remove an element from a collection --> Iterator
		Iterator<String> it=stringList.iterator();
		while (it.hasNext()) {
			if(it.next().length()<=4) {
				it.remove();
			}
		}
		System.out.println(stringList);
		;
		//remove names that are shorter than 4 characters
		
		
		for (int i=0;i<stringList.size();i++) {
			if (stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		
		System.out.println(stringList);
		
		
		
		
		
	}

}
