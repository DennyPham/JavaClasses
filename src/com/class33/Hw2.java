package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Cute");
		list.add("Love");
		list.add("Hello");
		list.add("Java");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			if(it.next().endsWith("e")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}
