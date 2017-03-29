package com.lcp.string.work;

public class StringNew {
	public static void main(String[] args){
		char[] helloArray = {'l','i','n','k','e','r',' '};
		String helloString = new String(helloArray);
		//System.out.println(helloString);
		int len = helloString.length();
		System.out.println(helloString+" "+"length:"+len);
		Object floatVar = 3.1415926;
		Object intVar = 4;
		Object stringVar = "linkernetworks.com";
		System.out.printf("浮点型变量的的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);
	}
}
