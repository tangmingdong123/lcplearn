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
		System.out.printf("�����ͱ����ĵ�ֵΪ " +
                "%f, ���ͱ�����ֵΪ " +
                " %d, �ַ���������ֵΪ " +
                "is %s", floatVar, intVar, stringVar);
	}
}
