package com.lcp.string.work;

import java.io.UnsupportedEncodingException;

public class StringNew {
	public static void main(String[] args) {
		String source = "  �����صش����ӳ��ƽԭ����Ҫ��ֲС�����׵�ũ����ǹ��Ҽ���Ʒ�����أ��Ǻӱ�ʡ��������������֮һ����ҵ��ëƤ�ӹ�����ķ�װ��ʳƷ�ӹ���ͼ��ӡˢ����Ϊ������ҵ��2013����ɵ���������ֵ130.0978��Ԫ������·��˷����·���������ڽ��������������վ����ú���˵���Ҫ��·��Ŧ 12345678ABC901234567890abc123456789  ";
		//countfor(source);
		//countwhile(source);
		//GDP(source);
		//System.out.println("�þ仰��" + source.length() + "���ַ�");
		//System.out.println("�þ仰ȥ����β�ո�" + source.trim().length() + "���ַ�");
		//newline(source);
		//changeencode(source);
		largeststring(source);
	}

	public static void countfor(String str) {
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.substring(i, i + 1)).equals("��")) {
				c++;
				System.out.println("���ֳ��ֵ�λ��Ϊ��" + i);
			}
		}
		System.out.println("���ֹ�����" + c);
	}

	public static void countwhile(String str) {
		int c = 0;
		int pos = -2;
		while (pos != -1) {
			pos = str.indexOf("��", pos + 2);
			if (pos == -1)
				break;
			System.out.println("���ֳ��ֵ�λ��Ϊ��" + pos);
			c++;
		}
		System.out.println("���ֹ�����" + c);
	}

	public static void GDP(String str) {
		int first = str.indexOf("������ֵ", 0);
		int last = str.indexOf("��Ԫ", 0);
		String value = str.substring(first + 4, last);
		System.out.println("������ֵ:" + value);
	}

	public static void newline(String str) {
		String[] a = str.split("��"); 
		for(int i=0;i<a.length;i++){  
			String[] b = a[i].split("��");
			for(int m=0;m<b.length;m++){
				String[] c = b[m].split("��");
				for(int n=0;n<c.length;n++){
				System.out.println("������: "+c[n]);
				}
			}
	    }
    }
    public static void changeencode(String str){
    	try{
			byte[] str1 = str.getBytes();
			
			str1 = str.getBytes( "UTF-8" );
			System.out.println("UTF-8����ֵ��" + str1 );
			
			str1 =str.getBytes( "ISO-8859-1" );
			System.out.println("ISO-8859-1����ֵ��" + str1 );
		} catch ( UnsupportedEncodingException e){
			System.out.println("��֧�ֵ��ַ���");
		}
    }
    public static void largeststring(String str){
    	String[] a = str.split("��"); 
    	String[] result=new String[12];
    	String temp = "";
		for(int i=0;i<a.length;i++){  
			String[] b = a[i].split("��");
			for(int m=0;m<b.length;m++){
				String[] c = b[m].split("��");
				for(int n=0;n<c.length;n++){
				result[n]=c[n];
				System.out.println("result"+n + result[n]);
				}
			}
	    }
		for(int i=1;i<result.length;i++){
			String t1=result[i-1];
			String t2=result[i];		
			if (t1.length()>=t2.length()){
				temp=t1;
			}
			else 
				temp=t2;
		}
		System.out.println("�ָ������ַ���Ϊ��" + temp);
		
	}

}
