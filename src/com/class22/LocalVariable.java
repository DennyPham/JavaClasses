package com.class22;

public class LocalVariable {
	
	
public static void main(String[] args) {
	LocalVariable obj=new LocalVariable();
	obj.sayName();
	obj.createEmail("Dennis", "Pham", "outlook");
	System.out.println();
}
void sayName() {
	String myName="John";
	System.out.println(myName);
}
String createEmail(String name, String lastName,String email) {
	String userEmail=name+lastName+"@"+email+".com";
	return userEmail;
}
}
