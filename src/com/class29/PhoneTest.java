package com.class29;

public class PhoneTest {
public static void main(String[] args) {
	//you can not directly create an object of an abstract class
	//Phone phone=new Phone(); -> CE: cannot intciate
	
	//we can create it indirectly
	Phone phone=new Samsung();
	phone.makeCall();
	phone.sendText();
	phone.takePictures();
	phone.playGames();
	
	
	System.out.println();
	
	
	Iphone obj=new Iphone();
	obj.takePictures();
	obj.playGames();
	
	Samsung object=new Samsung();
	object.takePictures();
	object.playGames();
}
}
