package com.java.abstractFactory;

public class FactoryCreator {
	
	
	public static AbstractFactory getFactoryCreator(String choice) {
		
		 if(choice.equalsIgnoreCase("bank")) {
		return new BankFactory();
	}
		else if(choice.equalsIgnoreCase("loan")) {
		return new LoanFactory();
	}else {
		
	   return null ;
	}
	}

}
