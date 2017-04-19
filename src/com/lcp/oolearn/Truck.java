package com.lcp.oolearn;

public class Truck extends Car{
	private int wheels;

	public void getWheelInfo(int args) {
		System.out.println(this.oil);
		System.out.println(this.weight);
		System.out.println(this.wheels);
	}

	public void setCarInfo(int oil, int weight,int wheels) {
		this.oil = oil;
		this.weight = weight;
		this.wheels = wheels;
	}

}
