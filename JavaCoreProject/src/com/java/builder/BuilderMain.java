package com.java.builder;

public class BuilderMain {
	
		public static void main(String args []) {
	      
			String a  = "abc";
			String b = "abc" ;
			System.out.println(a.equals(b));
			
			
			
			Mobile m1  = new  Mobile.Builder("OPPO").setColor("black").setPrice(11111).build();
			System.out.println(m1.toString());
			
		}
}
