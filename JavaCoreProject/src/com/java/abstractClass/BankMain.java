package com.java.abstractClass;

public class BankMain {
 
	public static void main(String args[]) {
		
		Bank sbi = new HDFC();
		
		sbi.interest();
		
		String x = "abc" ;
		//String y ="abc";
		
		String z  =  new  String("abc");
		String y  =  new  String("abc");
		
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		
		System.out.println(y==z);
		System.out.println(y.equals(z));
	}
}
