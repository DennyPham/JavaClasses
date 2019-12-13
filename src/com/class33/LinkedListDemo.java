package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create linked list of String objects
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		
		System.out.println(llist.size());
		llist.add("Hella");
		llist.add("Byi");
		//retrieve
		System.out.println(llist.get(1));
		//update/replace
		llist.set(2, "Hi");
		//how to retreve all value from linked list
		
		
		
	}

}
