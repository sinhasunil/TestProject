package com.java.abstractFactory;

public class SBI implements Bank {
	private String bankName  ;
	
	SBI() {
		bankName = "SBI bank" ;
		
	}

	@Override
	public String getBankName() {
		System.out.println(bankName);
		
		return bankName;
	}
	
	

}
