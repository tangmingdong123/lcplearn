package com.lcp.loop.learn;

public class LoopLearn {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 7 == 0) {
				System.out.println("������7��Ϊ��" + i);
				a++;
			}
		}
		System.out.println("����7�Ĺ��У�" + a + "������");

		for (int i = 1; i <= 1000; i++) {
			if (((i % 1000) / 100) == 7 || ((i % 100) / 10) == 7 || ((i % 10) / 1) == 7) {
				System.out.println("����7�ģ�" + i);
				b++;
			}
		}
		System.out.println("����7�Ĺ��У�" + b + "������");
		
		//����
		b = 0;
		for (int i = 1; i <= 1000; i++) {
			if (String.valueOf(i).indexOf("7")!=-1) {
				System.out.println("����7��-��" + i);
				b++;
			}
		}
		System.out.println("����7�Ĺ���-��" + b + "������");

	}
}
