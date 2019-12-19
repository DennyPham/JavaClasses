package com.class35;

import java.util.*;
import java.util.Map.Entry;
public class RetrieveAll {

	public static void main(String[] args) {
// lets create a map of a classroom in which we will store object and
// its quantities		

		Map<String, Integer>classroom=new HashMap<>();
		classroom.put("Instructor",3);
		classroom.put("Student",80);
		classroom.put("Tables",20);
		classroom.put("Chairs",80);
		
		System.out.println(classroom);
		Set<Entry<String, Integer>>entrySet=classroom.entrySet();
		
		System.out.println("-------- using for lop to get all entry obj");
		for(Entry<String,Integer>entry:entrySet) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("------- using Iterator toget all entry obj");
		
		Iterator<Entry<String, Integer>>entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+"----"+ent.getValue();
			System.out.println(entry);
		}
		
		
		
		
		
	}

}
