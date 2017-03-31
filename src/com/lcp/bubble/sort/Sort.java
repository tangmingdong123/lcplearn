package com.lcp.bubble.sort;

public class Sort {
	public static void sort(int[] num){
	for(int i=0;i<num.length;i++){
		int a=num[i];
		int b=num[i+1];
		if (a<=b){
			num[i]=b;
			num[i+1]=a;
		}
		System.out.println(num);
	}
 }
public static void main(int[] num){
	int[] num1 = {3,4,5,1,2,7,0,9,8};
	sort(num1);
 }
}
