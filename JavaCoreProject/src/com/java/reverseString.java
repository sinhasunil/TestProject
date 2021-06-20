package com.java;

import java.util.Scanner;
import java.util.stream.Collectors;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("enter your name");
		 * 
		 * String input = scanner.nextLine();
		 * 
		 * System.out.println(input);
		 * 
		 * char [] ch = input.toCharArray(); String output= "" ; for(int i = ch.length
		 * -1 ; 0<= i ;i--) {
		 * 
		 * output+=ch[i];
		 * 
		 * }
		 * 
		 * System.out.println(output); StringBuffer sb = new StringBuffer(input);
		 * 
		 * 
		 * System.out.println("-----------"+ sb.reverse());
		 */
		
		//--------------------------------------------------------------------------------------
		
		
		// remove special character
		
		
		
		String str  = "$$$Java!!&&&Strin!&&$g" ;
String plantxt= 	str.replaceAll("[^a-zA-Z0-9]", "");
		
		//System.out.println(plantxt);
		//String str1  = "Java  Strin   g" ;
		//String plantxt1 = 	str1.replaceAll("\\s", "");
		//System.out.println(plantxt1);
		
		
		String s  =  "programming" ;
		StringBuffer sb  = new StringBuffer();
		
		//   s.chars().distinct().forEach(e -> sb.append((char)(e)) );
			
	   //String  a =	s.chars().filter(e -> !s..content(e)).collect(Collectors.toList());
		
	
		
		
	}

}
