package com.java.builder;

public class Mobile {
	
	private String name ;
	private String color ;
	private String ram ;
	private double price ;
	

	
	private Mobile(Builder builder ) {
			this.name = builder.name;
			this.color = builder.color;
			this.ram= builder.ram;
			this.price = builder.price ;
			
		}
	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}


	public String getRam() {
		return ram;
	}


	public double getPrice() {
		return price;
	}


	static  class  Builder{
		
		private String name ;
		private String color ;
		private String ram ;
		private double price ;
		
		
		public Builder(String name) {
			this.name = name;
			
		}
		public Builder setColor(String color) {
			this.color = color;
			return this;
		}
		public Builder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public Builder setPrice(double price) {
			this.price = price;
			return this;
		}
		
		public Mobile build() {
			
			return new Mobile(this) ;
			
		}
		
		
		
	}


	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
}
