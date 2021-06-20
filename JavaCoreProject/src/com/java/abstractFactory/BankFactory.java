package com.java.abstractFactory;

public class BankFactory extends  AbstractFactory {

	@Override
	public Bank getBank(String bankName) {
		
		if(bankName.equalsIgnoreCase("sbi")) {
			return new SBI();
		}
		else if(bankName.equalsIgnoreCase("hdfc")) {}
		return new HDFC();
		
			
	
	}

	@Override
	public Loan getLoan(String loanType) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
