package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hw4 {

	public static void main(String[] args) {
		//Creating an Object of ArrayList and refering to the List
		List<Integer> nums=new ArrayList<>();
		//Storing even numbers using loop
		for (int i=1;i<=50;i++) {
			if(i%2==0) {
				nums.add(i);
			}
		}

		System.out.println(nums);
		//Removing numbers divisible by 5 using iterator
		Iterator<Integer>it=nums.iterator();
		while(it.hasNext()) {
			if(it.next()%5==0) {
				it.remove();
			}
		}
		System.out.println(nums);
	}

}
