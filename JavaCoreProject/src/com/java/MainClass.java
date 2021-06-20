package com.java;

public class MainClass {
	
	

	public static void main(String[] args) throws CloneNotSupportedException 
    {
		
		PlanFactory p  = new  PlanFactory();
		
		ElectricBillPlan  e  =p.getPlan("DomesticPlan") ;
		e.getRate();
		e.calculateBill(100);
		ElectricBillPlan  c  =p.getPlan("CommercialPlan") ;
		c.getRate();
		c.calculateBill(100);
    }
}

/*
 * if(planType== "DomesticPlan") plan = new DomesticPlan(); else if(planType==
 * "CommercialPlan") plan = new CommercialPlan();
 */