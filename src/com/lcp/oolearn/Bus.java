package com.lcp.oolearn;

public class Bus extends Car {
	private int capacity;

	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity){
		this.capacity=capacity;
	}
@Override
	public void printInfo() {
	System.out.println(this.getOil());
	System.out.println(this.getWeight());
	System.out.println(this.getCapacity());
	}

}
