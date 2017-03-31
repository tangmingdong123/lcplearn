package com.lcp.bubble.sort;

public class StringSort {
	public static void sort(String[] strs){
		for (int i = 0; i < strs.length; i++) {
			for (int n = 1; n < strs.length; n++) {
				String a = strs[n - 1];
				String b = strs[n];
				if (a.compareTo(b)>0) {
					strs[n - 1] = b;
					strs[n] = a;
				}
			}
		}
		System.out.print("排序后结果为：");
		for (int m = 0; m < strs.length; m++) {
			System.out.print(strs[m] + ",");
		}
	
 }
public static void main(String[] args){
	String[] strs = new String[]{
			"x","y","z","j","k","l","n","m","o","p","q","s","r","t","u","v","w","g","h","i","e","f","d","c","b","a"
	};
	
	sort(strs);
 }
}
