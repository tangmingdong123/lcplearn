package com.lcp.loop.learn;

public class LoopLearn {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 7 == 0) {
				System.out.println("能整除7的为：" + i);
				a++;
			}
		}
		System.out.println("包含7的共有：" + a + "个数字");

		for (int i = 1; i <= 1000; i++) {
			if (((i % 1000) / 100) == 7 || ((i % 100) / 10) == 7 || ((i % 10) / 1) == 7) {
				System.out.println("包含7的：" + i);
				b++;
			}
		}
		System.out.println("包含7的共有：" + b + "个数字");

	}
}
