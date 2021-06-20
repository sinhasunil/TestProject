package com.java.prototype;

class blueColor extends Color
{
    public blueColor() 
    {
        this.ColorName = "blue";
    }
   
    @Override
	public void addColor() 
    {
        System.out.println("Blue color added");
    }
      
}
