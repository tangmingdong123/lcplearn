package com.lcp.oolearn;

public class Car {

	private int oil;
	private int weight;

	public void getCarInfo(int args) {
		System.out.println(this.oil);
		System.out.println(this.weight);
	}

	public void setCarInfo(int oil, int weight) {
		this.oil = oil;
		this.weight = weight;
	}

}
