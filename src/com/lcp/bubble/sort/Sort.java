package com.lcp.bubble.sort;

public class Sort {
	public static void sort(int[] num){
	for(int i=0;i<num.length;i++){
		for(int n=1;n<num.length;n++){
		int a=num[n-1];
		int b=num[n];
		if (a>=b){
			num[n-1]=b;
			num[n]=a;
		}
		}
	}
	for(int m=0;m<num.length;m++){
		System.out.println(num[m]);
	}
 }
public static void main(String[] args){
	int[] num = {3,4,5,1,2,7,0,9,8};
	sort(num);
 }
}
