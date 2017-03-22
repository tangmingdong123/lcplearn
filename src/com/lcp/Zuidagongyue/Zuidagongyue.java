package com.lcp.Zuidagongyue;

public  class Zuidagongyue{
	public static void main(String[] args){
		System.out.println("最大公约："+getMaxDivide_ab(12,6));
	}
	public static int getMaxDivide_ab(int a,int b){
		int C=1;
		int max;
		int min;
		if(a==b)
			C=a;
		if(a>b){
			max=a;
			min=b;
		}
		else{
			max=b;
			min=a;
		}
		for(int i=2;i<=min;i++){
			if(max%i==0 && (min%i)==0){
				C=i;
			}
		}
		return C;
	}
}