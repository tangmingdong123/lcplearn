package com.lcp.oolearn;

public class Truck extends Car{
	private int wheels;
	
	public int getWheels(){
		return wheels;
	}
	
	public void setWheels(int wheels){
		this.wheels=wheels;
	}
@Override
	public void printInfo() {
		System.out.println(this.getOil());
		System.out.println(this.getWeight());
		System.out.println(this.getWheels());
	}

}
