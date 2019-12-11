package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw3 {

	public static void main(String[] args) {
		ArrayList<String>drinks=new ArrayList<String>();
		drinks.add("Cola");
		drinks.add("Milk");
		drinks.add("Coffee");
		drinks.add("Juice");
		drinks.add("Tea");
		
		drinks.set(0,"Water");
		System.out.println(drinks);
		
	Iterator<String> it=drinks.iterator();
	while(it.hasNext()) {
	String	str=it.next();
	if(str.contains("a")||str.contains("e")) {
		int i=drinks.indexOf(str);
		drinks.set(i, "Water");
	}
	}
	System.out.println(drinks);
	}

}
