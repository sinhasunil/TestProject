package com.java;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
	  try {
		
		 String a = "abcd";
		 String b = "abcd";
		 String s  = new String("abcd");
		 
		 System.out.println(a.equals(s));
		 System.out.println(b.equals(s));
		 System.out.println(a == s.intern());
		 System.out.println(a.equals(b) );
		  
		  
		  
			/*
			 * Scanner scanner = new Scanner(System.in);
			 * System.out.println(" Enter armstrong number : "); int n = scanner.nextInt();
			 * int c =0, temp , a ; temp =n ;
			 * 
			 * int length = String.valueOf(n).length();
			 * 
			 * System.out.println("length"+length);
			 * 
			 * while(n > 0) { a=n%10; System.out.println("n%10   "+a); n=n/10;
			 * 
			 * System.out.println("n/10    "+n);
			 * 
			 * c=(int) (c+ Math.pow(a,length)); System.out.println("c------>"+c);
			 * 
			 * 
			 * } if(temp==c) System.out.println("armstrong number"); else
			 * System.out.println("Not armstrong number");
			 */
		  
	  }catch(Exception e) {
		  
		  
	  }

	}

}
