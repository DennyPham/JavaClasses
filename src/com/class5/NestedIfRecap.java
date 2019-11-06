package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
		
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if (isDisplayed) {
			System.out.println("Button is displayed");
		
		if (buttonText.equals("Sign In")) {

		System.out.println("test case pass");
		}else {
			System.out.println("Wrong text is displayed");
		}
		
		
		}else {
			System.out.println("Button is not displayed");
		}
		
		
		
		
	}

}
