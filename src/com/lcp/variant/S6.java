package com.lcp.variant;

public class S6 {
	private static String size = "16cm*32cm";//�ֻ��Ĵ�С��S6ϵ���ֻ�������һ����С��������static��
	
	private String buyDate = null;//�������ڣ�ÿһ���ֻ������Լ��Ĺ������ڣ����Բ���static��
	
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
