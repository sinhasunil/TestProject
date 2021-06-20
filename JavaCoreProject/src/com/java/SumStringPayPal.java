package com.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumStringPayPal {
	
	private static void process(List<String> list) {
		 long len=0 ;
		 String  str = "" ;
		 
		String ss =  list.stream().map(w -> new StringBuffer(w).reverse()).collect(Collectors.joining(" "));
		long  len1 =ss.chars().count() -1 ;
		
		System.out.println(ss + len1);
		
		   // list.stream().reduce((w1,w2) -> w1.chars().count() + w2.chars().count()).get(); 
		 
		// Optional<String> val = list.stream().reduce((w1, w2)->  w1 +" "+ w2);
		
		 //System.out.println(val.stream().collect(Collectors.groupingBy(Object::Character ,Collectors.counting()));
		 // System.out.println(val.get());
		 
		 StringBuffer  sb  = new StringBuffer();
		 
		// list.stream().filter(e ->  e.length()).collect(Collectors.)
		 
		 
		 
		  Collections.reverse(list);
		  
		  System.out.println("--------------"+list.toString());
		 
		for(String s : list) {
			
			
			
		 	len  +=  s.chars().count() ;
		    str += s.substring(0,1).toUpperCase()  +  s.substring(1).toLowerCase() + " ";
		    
		    
		    sb.append(s);
		    sb.reverse();
		    
		}
		

		System.out.println(len);
		System.out.println(str);
		System.out.println(sb);
	
		
	}

	public static void main(String[] args) {
		
			Scanner  scanner  =  new Scanner(System.in);
			System.out.println("enter first String ");
			String input1  =  scanner.nextLine();
			
			System.out.println("enter second String");
			String input2  =  scanner.nextLine();
			
			List<String> l = new  ArrayList<>();
			l.add(input1);
			l.add(input2);
			
			process(l);
		}
		
	

}
