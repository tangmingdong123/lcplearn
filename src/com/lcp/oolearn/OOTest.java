package com.lcp.oolearn;

public class OOTest {
	public static void main(String[] args){
		int[] wheel = {4,6,8,10,12};  
		Truck[] trucks = new Truck[5];  
		for(int i=0;i<5;i++){
			trucks[i] = new Truck();
			trucks[i].setWheels(wheel[i]);
			System.out.println(trucks[i].getWheels());
	}	
  }
}
