package com.java.prototype;

public class Student implements Prototype {

	 int rollno ;
	 String name,address,mobile;
	public Student(int rollno, String name, String address, String mobile) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}
	
	
	void show(){
		
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(address);
		System.out.println(mobile);
		
	}


	
	
	  @Override 
	  public Prototype getClone() { return new
	  Student(rollno,name,address,mobile); }
	 

}
