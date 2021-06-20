package com.java.abstractFactory;

public class EducationLoan extends  Loan{

	@Override
	void getInterest(double rate) {
		this.rate  =rate;		
	}

}
