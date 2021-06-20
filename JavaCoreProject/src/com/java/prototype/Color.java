package com.java.prototype;

abstract class Color implements Cloneable{
	
	public String ColorName ;
	
	public abstract void addColor() ;
	
	public Object clone()
    {
        Object clone = null;
        try 
        {
            clone = super.clone();
        } 
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
        return clone;
    }

}
