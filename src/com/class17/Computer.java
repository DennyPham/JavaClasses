package com.class17;

public class Computer {

		// define feature, attributes
		String monitor, brand, name, mouse;
		boolean keyboard;
		int size,memory, screen, ram;
		
		//define behavior, action
		void playGames() {//method header	
			//method body
			System.out.println("I can play on my "+name);
		}
		void javaCoding() {
			System.out.println("I can do Java coding on my "+name);
		}
		void watchMovie() {
			System.out.println("I can watch Movies on my "+name);
		}
		
		
		////////////////////////////////////////
		
		
		public static void main (String args []) {
			Computer comp1= new Computer();
			comp1.brand="Apple";
			comp1.name="Mac Book Pro";
			comp1.memory=250;
			
			System.out.println("I have a "+comp1.brand+" "+comp1.name);
			comp1.javaCoding();
			comp1.watchMovie();
			
			System.out.println("Creating 2 object of a computer type");
			Computer comp2=new Computer();
				comp2.brand="Dell";
				comp2.name="420";
				comp2.memory=150;
				System.out.println("I have a "+ comp2.brand+" "+comp2.name);
				comp2.playGames();
				comp2.javaCoding();
				comp2.watchMovie();
					
		}
	}


