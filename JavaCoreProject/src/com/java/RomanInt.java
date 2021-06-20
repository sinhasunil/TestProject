package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class RomanInt{
	
	public static void process(String input) {
		
		Map<Character, Integer>map =  new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int  result  = 0;
		
	 for(int i  =0 ; i < input.length();i++) {
		 int s1  =  map.get(input.charAt(i));
		 if(i+1 < input.length()) {
			 int s2 =  map.get(input.charAt(i+1));
			 if(s1 >= s2) {
				result  +=s1 ;
			   }else {
				 
				 result += s2-s1 ;
				 i++;
			 }
			 
		 }else{
			 
			 result +=s1;
		 }
	 
	 }
		
		System.out.println(result);
	}
	
	public static void main(String args[]) {
		Scanner  scanner  =  new Scanner(System.in);
		System.out.println("enter roman letter to be convert into numberic");
		String input  =  scanner.nextLine();
		process(input);
	}
	
	
	
	
	
}