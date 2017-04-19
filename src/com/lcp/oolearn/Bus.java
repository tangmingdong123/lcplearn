package com.lcp.oolearn;

public class Bus extends Car {
	private int capacity;

	public void getCarInfo(int args) {
		System.out.println(this.oil);
		System.out.println(this.weight);
		System.out.println(this.capacity);
	}

	public void setCarInfo(int oil, int weight,int capacity) {
		this.oil = oil;
		this.weight = weight;
		this.weight = capacity;
	}

}
