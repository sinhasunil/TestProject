package com.java;

public class PlanFactory {
	
	ElectricBillPlan plan = null ;
	
	public ElectricBillPlan getPlan( String planType) {
		
		if(planType== "DomesticPlan")
			plan  = new DomesticPlan();
		else if(planType== "CommercialPlan")
			plan = new  CommercialPlan();
		else
			plan = null;
		
		return plan ;
	}

}
