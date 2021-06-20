package com.java.prototype;

import java.util.Scanner;

public class PrototypeMain {

	public static void main(String[] args) {
		
		Student s  = new Student(11,"Ram","address","12213");
		
		Student s2  = new Student(12,"Ram","address","12213");
		 
		  System.out.println("----s---"+s);
		  System.out.println("----s2---"+s2);
		
		  s.show();
		  
		  System.out.println("----prototype---");
		  
		  Student s1  =(Student) s2.getClone() ;
		  
		  System.out.println("----prototype  s1---"+s1);
           s1.show();
	}

}
