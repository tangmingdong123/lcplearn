package com.lcp.string.work;

public class StringNew {
	public static void main(String[] args){
		String source ="�����صش����ӳ��ƽԭ����Ҫ��ֲС�����׵�ũ����ǹ��Ҽ���Ʒ�����أ��Ǻӱ�ʡ��������������֮һ����ҵ��ëƤ�ӹ�����ķ�װ��ʳƷ�ӹ���ͼ��ӡˢ����Ϊ������ҵ��2013����ɵ���������ֵ130.0978��Ԫ������·��˷����·���������ڽ��������������վ����ú���˵���Ҫ��·��Ŧ 12345678ABC901234567890abc123456789";
        countfor(source);
        countwhile(source);
	}
	
	public static void countfor(String str ){
		int c=0;
		for(int i=0;i<str.length();i++){
			if((str.substring(i,i+1)).equals("��")) {
				c++;
				System.out.println("���ֳ��ֵ�λ��Ϊ��"+i);
			}
		}
		System.out.println("���ֹ�����"+c);
	}
	public static void countwhile(String str){
		int c=0;
		int pos=-2;
		while(pos!=-1){
			pos=str.indexOf("��",pos+2);
			if(pos==-1)break;
			System.out.println("���ֳ��ֵ�λ��Ϊ��"+pos);
			c++;
		}
		System.out.println("���ֹ�����"+c);
	}
}

