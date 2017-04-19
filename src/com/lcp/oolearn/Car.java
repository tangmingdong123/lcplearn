package com.lcp.oolearn;

public class Car {

	private int oil;
	private int weight;

	public int getOil() {
		return oil;
	}

	public int getWeight() {
		return weight;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public void setWeight(int weight) {
		this.oil = weight;
	}

	public void printInfo() {
		System.out.println(this.oil);
		System.out.println(this.weight);
	}

}
