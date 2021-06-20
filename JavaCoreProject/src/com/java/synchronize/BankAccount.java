package com.java.synchronize;

public class BankAccount {
	
	
	
	private  int balance;
	
	public  BankAccount() {
		this.balance  = 0;
		
	}
	public  BankAccount(int balance) {
		
		this.balance  =balance ;
	}
	
	
	public synchronized  int getWithdraw(int  w) {
		int b  =  getBalance() ;
		
		if(w <= b) {
		balance =  b - w ;
		
		}
		
		return w ;
	}
	public int getBalance() {
		
	return balance ;
	}

}
