package com.class06;

import java.util.Scanner;

public class ScannerSwitch {
	public static void main (String [] args) {
		Scanner scan=new Scanner (System.in);
	String country, foodName;
	System.out.println("Please enter your country");
	country=scan.nextLine();
	switch(country) {
	case "Turkey":
		foodName="kebab";
		break;
	case "Ethiopia":
		foodName="Tibs";
		break;
	case "Vietnam":
		foodName="Pho";
		break;
	case "Morocco":
		foodName="Tajin";
		break;
	case "Kazakhstan":
		foodName="Kumis";
		break;
	case "Pakistan":
		foodName="Beryani";
		break;
	case "Russia":
		foodName="aviar";
		break;
	case "Cuba":
		foodName="Sofrito";
		break;
		default:
			foodName="Unknown";
		
	}
		
	System.out.println("You are from "+ country + " and your favorite food is " + foodName); 
		
		
		
		
		
		
	}
}
