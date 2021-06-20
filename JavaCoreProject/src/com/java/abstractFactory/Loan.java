package com.java.abstractFactory;

abstract public class   Loan {
	
	double rate ;
	abstract void getInterest(double rate) ;
	
  void  calculate(double amount ,int  year) {
		System.out.println("amount"+ amount);
		System.out.println("rate"+rate);
		System.out.println("year"+year);
		
		System.out.println("rate of interest is   " +  (amount*rate*year)/100);
	}
}
