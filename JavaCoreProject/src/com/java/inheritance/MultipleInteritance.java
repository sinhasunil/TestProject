package com.java.inheritance;

public class MultipleInteritance implements Right,Left {
	
	@Override
	public void m() {
		
		System.out.println("override multiple inheritance ...");
		//Right.super.m();
		
		Left.super.m();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleInteritance  t = new  MultipleInteritance();
     t.m();
	}

}
