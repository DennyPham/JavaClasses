package com.class34;

import java.util.*;

public class HashSetDemo2 {

	public static void main(String[] args) {
	//craete a collection that will store Sweets type of Object
	//I don't care about the order as long as i don't duplicate object

		HashSet<Sweets> sSet=new HashSet<>();
		
		sSet.add(new Sweets("cake"));
		sSet.add(new Sweets("cookie"));
		sSet.add(new Sweets("brownies"));
		sSet.add(new Sweets("chocolate"));
		sSet.add(new Sweets("ice cream"));
		sSet.add(new Sweets("macaroons"));
		sSet.add(new Sweets("cake"));
		
		System.out.println(sSet.size());
		//how do we print name of each sweets
		System.out.println("--------1st way");
		for (Sweets element:sSet) {
			System.out.println(element.name);
		}
		System.out.println("--------2nd way");
		Iterator<Sweets> it=sSet.iterator();
		while(it.hasNext()) {
		System.out.println(it.next().name);
		}
		
		
		
		
	}
}
