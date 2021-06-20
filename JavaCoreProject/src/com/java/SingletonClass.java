package com.java;

import java.io.Serializable;

public class SingletonClass implements Serializable,Cloneable {
	
	public static final SingletonClass INSTANCE = null;
	public static  SingletonClass singleton = new SingletonClass(); 
	
	private SingletonClass() {
		
	}
	 @Override
	  protected Object clone() throws CloneNotSupportedException 
	  {
	    return singleton;
	  }
		
	
	 // implement readResolve method
    protected Object readResolve()
    {
        return singleton;
    }

}
