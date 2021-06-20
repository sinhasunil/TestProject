package com.java;

public final class A  implements  Cloneable {
	
	static A  a  ;

	A() {
		// TODO Auto-generated constructor stub
	}
	
	public static synchronized A getObject() {
		
		if(a == null) {
			
			a  = new  A();
		}
		return a;
	}

}
