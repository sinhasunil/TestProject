package com.java.abstractClass;

abstract class Bank {
	
	public void deposite() {
		
		System.out.println("common deposite method");
	}
	
  public void withdraw() {
		
		System.out.println("common withdraw method");
	}

 
  abstract  void interest() ;
	 
	 
 
}

class HDFC extends  Bank{

	@Override
	void interest() {
		System.out.println("HDFC  interest method");

		
	}

}
class SBI extends  Bank{

	@Override
	void interest() {
		System.out.println("SBI  interest method");

		
	}
	
	
}