package com.class10;

public class GetAllValues {

	public static void main(String[] args) {
		// i want to print all values from an array
		//When value is a dog ----> I love dogs
		String[] animals= {"cat","dog","Snake","cow","elephant"};
		for (int i=0; i<animals.length;i++) {
			
			if(animals[i].equals("dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
		}

		
		String[] countries= {"United State", "Vietnam", "Tailand"};
		
		for (int i=0; i<countries.length;i++) {
			
			if(countries[i].equals("United State")) {
				System.out.println(countries[i]+" :"+"Washington D.C.");
			}else if(countries[i].equals(countries[i]+" :"+"Vietnam")) {
				System.out.println("Hanoi");
			}else {
				System.out.println(countries[i]+" :"+"Bangkok");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
