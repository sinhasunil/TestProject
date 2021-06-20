package com.java.abstractFactory;

public class LoanFactory extends AbstractFactory{

	@Override
	public Bank getBank(String bankName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan getLoan(String loanType) {
		if(loanType.equalsIgnoreCase("home")) {
			return new HomeLoan();
		}
		else if(loanType.equalsIgnoreCase("education")) {
			return new  EducationLoan();
		}
		else
			return null;
		
		
		
	}

}
