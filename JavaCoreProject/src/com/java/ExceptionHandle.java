package com.java;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		try {
			
			int balance  = 6000;
			int withdraw =  7000;
			if(withdraw > balance) {
				throw new  ArithmeticException("Insuficient Balance");
				
			}
			System.out.println("withdraw balance is more");
			
		}catch(NullPointerException ae) {
			
			System.out.println(ae.getMessage());
		}
		catch(ArithmeticException ae) {
			
			System.out.println(ae.getMessage());
		}
		
		finally {
		System.out.println("a process is contunued");
		}
	}

}
