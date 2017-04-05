package com.lcp.variant;

public class S6 {
	private static String size = "16cm*32cm";//手机的大小，S6系列手机都是这一个大小，所以是static的
	
	private String buyDate = null;//购买日期，每一个手机都有自己的购买日期，所以不是static的
	
	public static void printS6(){
		System.out.println("S6.size="+S6.size);
	}
	
	public void printBuyDate(){
		System.out.println("mydate="+buyDate);
	}
	
	public static void main(String[] args) {
		S6.printS6();
		
		S6 tmdS6 = new S6();
		tmdS6.buyDate = "2015--05-28";
		tmdS6.printBuyDate();
	}
}
