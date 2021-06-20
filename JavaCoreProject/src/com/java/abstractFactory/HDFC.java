package com.java.abstractFactory;

public class HDFC implements Bank {

	
private String bankName  ;
	
	HDFC() {
			bankName = "HDFC bank" ;
			
		}
		@Override
		public String getBankName() {
			System.out.println(bankName);
			return bankName;
		}
	
	

}