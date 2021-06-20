package com.java.abstractFactory;

import java.util.Scanner;

public class FactoryMain {

	public static void main(String[] args) {
		
		Scanner s  = new Scanner(System.in);
		System.out.println("enter choice  bank or  loan");
		String choiceType = s.next();
		if(choiceType.equalsIgnoreCase("bank")) {
		System.out.println("enter choice  bank name");
		String bankName = s.next();
		AbstractFactory  af  = FactoryCreator.getFactoryCreator(choiceType);
	    Bank        bk  = af.getBank(bankName);
	    System.out.println(bk);
		}
		
		if(choiceType.equalsIgnoreCase("loan")) {
			
			System.out.println("enter loan type ");
			String loan = s.next();
			System.out.println("enter amount ");
			double amount = s.nextDouble();
			System.out.println("enter rate of interest ");
			double rate = s.nextDouble();
			System.out.println("enter year ");
			int year = s.nextInt();
			
		AbstractFactory  af  = FactoryCreator.getFactoryCreator(choiceType);
		    Loan         ln  = af.getLoan(loan);
		    
		       System.out.println(ln);
		        ln.rate= rate;
		        ln.getInterest(rate);
		        ln.calculate(amount, year);
		
		}
		

	}

}
