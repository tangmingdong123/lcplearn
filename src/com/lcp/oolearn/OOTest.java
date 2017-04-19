package com.lcp.oolearn;

public class OOTest {
	public static void main(String[] args){
		int[] wheel = {4,6,8,10,12};  
		int[] capacity={10,20,30,40,50};
		Truck[] trucks = new Truck[5];  
		Bus[] bus = new Bus[5];
		int wheelNum=0;
		int capacityNum=0;
		for(int i=0;i<5;i++){
			trucks[i] = new Truck();
			trucks[i].setWheels(wheel[i]);
			wheelNum=wheelNum+trucks[i].getWheels();
			bus[i] = new Bus();
			bus[i].setCapacity(capacity[i]);
			capacityNum=capacityNum+bus[i].getCapacity();
	}	
		System.out.println(wheelNum);
		System.out.println(capacityNum);
  }
}
