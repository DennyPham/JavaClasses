package com.class13;

public class StringminiRecap {

	public static void main(String[] args) {
	
	String str = new String ("Hello");
	String str3= new String ("Hello");
	System.out.println(str.equals(str3));
	
	System.out.println("######################");
	
	String s1="Hello";
	String s2="Hello";
	System.out.println(s1==s2);
	
	
	System.out.println(str);
	String str2=str.replaceAll("Hello", "Bye");
	System.out.println(str2);
	
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
	
	//.replace
	String s3="Your Syntax Technologies is your place to study";
	System.out.println(s3.replace('y', 'i'));
	System.out.println("*****************");
	
	System.out.println(s3.replace("your", "My"));
	System.out.println("&&&&&&&&&&&&&&&&&&");
	
	//.replaceAll
	String str4="12346Hell49324o@#$@%@#";
	System.out.println(str4.replaceAll("[0-9]", ""));
	System.out.println(str4.replaceAll("[^a-zA-Z]", ""));
	
	System.out.println("^^^^^^^^^^^^^^^^^^^");
	System.out.println(str4.replaceFirst("4","God" ));
	
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
	System.out.println(s3.toLowerCase().replace("your", "my"));
	
	
	
	
	
	
	
	
	
	
	
	}

}
