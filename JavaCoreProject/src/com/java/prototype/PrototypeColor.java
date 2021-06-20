package com.java.prototype;

public class PrototypeColor {
	public static void main (String[] args)
    {
        ColorStore.getColor("blue").addColor();
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("red").addColor();
        ColorStore.getColor("blue").addColor();
    }
}