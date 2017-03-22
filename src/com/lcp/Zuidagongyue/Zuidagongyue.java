package com.lcp.Zuidagongyue;

public class Zuidagongyue{
	
	public static void main(int a,int b){
		
		System.out.println("12和6的最大公约数是："+getMaxDivide_ab(12,6));
		
	}
	
	public static int getMaxDivide_ab(int a,int b){
        int value=1;
        int max;
        int min;
        if(a==b){
                return a;
        }
        if(a>b){
                max=a;
                min=b;
        }else{
                max=b;
                min=a;
        }
        for(int i=2;i<min;i++){
                if(0==max%i && 0==min%i){
                        value=i;
                }
        }
        return value;
}


}
