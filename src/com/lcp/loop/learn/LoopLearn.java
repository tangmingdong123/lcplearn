package com.lcp.loop.learn;

public class LoopLearn {
	
	public static void main(String[] args){
		for(int i=1;i<=1000;i++){
			if (i%7==0)	    
		        System.out.println("能整除7的为："+i);
	}
		for(int i=1;i<=1000;i++){
			if (i%1==7||i%10==7||i%100==7)	    
		        System.out.println("包含7的："+i);
	}
	}	
}
