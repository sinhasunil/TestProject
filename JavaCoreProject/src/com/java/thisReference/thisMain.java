package com.java.thisReference;

public class thisMain {
	
	int x  = 10; 
	

	public static void main(String[] args) {
		
		thisMain t  = new thisMain();
		
	  t.show();
	}
	
	public  void show() {
		
		int  x  = 20 ;
		
	System.out.println(this.x);
	System.out.println(x);
	}

}
