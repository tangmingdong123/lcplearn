package com.lcp.string.work;

public class StringNew {
	public static void main(String[] args){
		char[] helloArray = {'l','i','n','k','e','r',' '};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		int len = helloString.length();
		System.out.println("length:"+len);
	}
}
