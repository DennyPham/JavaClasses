package com.class36;
import java.util.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.class24.Constructor;
public class CarTests {
	
	String make,model;
	
	public CarTests(String make,String model) {
		this.make=make;
		this.model=model;
	}
	public void display() {
		System.out.println(make+" "+model);
	}

public static void main(String[] args) {
		Map<Integer, CarTests>mapCar=new LinkedHashMap<>();
		mapCar.put(1,new CarTests ("BMW","X5"));
		mapCar.put(2,new CarTests ("Tesla","S"));
		mapCar.put(3,new CarTests ("Mercedes","S5"));
		mapCar.put(4,new CarTests ("Toyota","Rav4"));
		mapCar.put(5,new CarTests ("Honda","Civic"));
		mapCar.put(2,new CarTests ("Lincoln","Mkc"));
		//display only value Object
		Collection <CarTests>coll=mapCar.values();
		for (CarTests c:coll) {
			System.out.println(c.make);
			System.out.println(c.model);
			
			c.display();
		}
		System.out.println(mapCar.size());
		
		//map key to its corresponding values (entrySet or keySet)
		
		Set<Entry<Integer,CarTests>> set=mapCar.entrySet();
		for (Entry<Integer,CarTests> ent:set) {
			Integer i=ent.getKey();
			CarTests c=ent.getValue();
			System.out.println("Key "+i+" is accociated with value of "+c.make);
			
			//using keySet to map keys to values
			Set<Integer>keySet=mapCar.keySet();
			for (int key:keySet) {
			System.out.println(key+"="+mapCar.get(key).make+"_"+mapCar.get(key).model);
			
			}
		}
	}
}
