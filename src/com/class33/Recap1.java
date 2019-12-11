package com.class33;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	public static void main(String[] args) {
		int a;
		a=10;
		
		int b=20;
		
		Student s1=new Student("Dennis",123);
		
		List<Student>list=new ArrayList<>();
		list.add(s1);
		list.add(new Student("Bobby",988));
		list.add(new Student("Akon",857));
		list.add(new Student("Lucy",433));
		list.add(new Student("Tyler",432));
		list.add(new Student("Bucky",889));
		
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
		Student st=it.next();
		System.out.println(st.name);
		}
		

	}

}
