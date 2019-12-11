package com.class31;

public class Account {
	
	private long accountNumber;
	private double balance;
	//getter
	public long getAccountNumber() {
		return accountNumber;
	}
	//getter
	public double getBalance() {
		return balance;
	}
	//setter
	public void setBalance(int amount) {
		if(amount>0) {
		balance=balance+amount;
		}
	}
	//setter
	public void setAccountNumber(long accountNumber){
	this.accountNumber=accountNumber;
	}
}
