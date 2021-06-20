package com.java.prototype;

class RedColor extends Color
{
    public RedColor() 
    {
        this.ColorName = "RedColor";
    }
   
    @Override
	public void addColor() 
    {
        System.out.println("RedColor color added");
    }
      
}
