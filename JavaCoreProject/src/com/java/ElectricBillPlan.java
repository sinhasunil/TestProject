package com.java;

public abstract class ElectricBillPlan {
	
	double bill_rate ;
	int unit ;
	public  abstract  void getRate() ;
	
	public void calculateBill(int unit) {
		System.out.println(unit*bill_rate);
	}

}
