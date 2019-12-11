package com.class31;

public class AccountTest {
public static void main(String[] args) {
	Account acc=new Account();
	long accoutnum=acc.getAccountNumber();
	acc.setAccountNumber(123456789);
	System.out.println(accoutnum);
	
	acc.setBalance(200);
	double myBalance=acc.getBalance();
	System.out.println(myBalance);
	
	
	
}
}
