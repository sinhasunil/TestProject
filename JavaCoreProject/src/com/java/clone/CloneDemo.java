package com.java.clone;

public class CloneDemo implements Cloneable {
	
	int i =  10 ;
	int j  = 20;
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		CloneDemo  cd  = new  CloneDemo();
		
		System.out.println(cd.i);
		System.out.println(cd.j);
		
		CloneDemo c = (CloneDemo) cd.clone();
		 c.i = 100;
		 c.j= 200;
		 System.out.println(c.i);
		 System.out.println(c.j);
		 System.out.println(cd.i);
		 System.out.println(cd.j);

	}

}
