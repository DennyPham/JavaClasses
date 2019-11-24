package com.class19;

public class Task {
	String creatEmail(String word,String word1,String word2) {
		String email=word+word1+word2;
		return email;
	}
	boolean prime(int num) {
		boolean isPrime=true;
		for (int i=2;i<num/2; i++) {
			if (num%i==0) {
				
			}
		}
		return isPrime;
		
	}
	

	public static void main(String[] args) {
		Task email=new Task();
		String mail=email.creatEmail("Dennis", "Pham", "@gmail.com");
		System.out.println(mail);
	}

}
