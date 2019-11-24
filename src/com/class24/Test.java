package com.class24;

public class Test {

	public static void main(String[] args) {
		
		Child1 child1=new Child1();
		child1.hairColor="Brown";
		System.out.println(Child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.Sing();
		child1.code();
		
		Parent parent=new Parent();
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		System.out.println(Parent.race);
		parent.Sing();
	}

}
