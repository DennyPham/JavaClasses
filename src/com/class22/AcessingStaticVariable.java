package com.class22;

public class AcessingStaticVariable {

	public static void main(String[] args) {
		
		Husky obj=new Husky();
		System.out.println(obj.name);
		obj.name="JackJack";
		System.out.println(obj.name);
		
		
		System.out.println(Husky.breed);
		
		Husky.breed="Doberman";
		System.out.println(obj.breed);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
