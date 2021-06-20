package com.java.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	void m1();
	default void m2() {
		
		System.out.println("m2 default interface");
	}
	
default void m3() {
		
		System.out.println("m3 default interface");
	}

static void m4() {
	
	System.out.println("m4  static method interface");
}


}
