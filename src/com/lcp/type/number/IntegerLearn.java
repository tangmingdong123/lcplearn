package com.lcp.type.number;

public class IntegerLearn {

	public static void main(String[] args) {
		//������
		printTangAndPingzi();

		
		//��Ŀ�����Ǽ��ĸ��˵�,����͡��ְ����������ְ������ܵܣ�ȫ��ƽ������
	}
	public static void printTangAndPingzi(){
		int tangAge = 33;
		int pingziAge = 26;
		
		//���Ǽ���һ��
		System.out.println("�Ҹ�ƿ��һ����"+(tangAge+pingziAge)+"��");
		
		//���ǲ������
		System.out.println("�ұ�ƿ�Ӵ�"+(tangAge-pingziAge)+"��");
		
		//����ƽ��������
		System.out.println("����ƽ����"+(tangAge+pingziAge)/2+"��");
		
		//��������
		System.out.println("�����㼸����"+(tangAge/pingziAge));
		System.out.println("�����������"+(tangAge%pingziAge));
		
		//����ƿ�Ӷ��
		System.out.println("����ƿ�ӣ�"+pingziAge*2+"��");
		
		//�����ҵ�����
		System.out.println("�����ҵ�������"+(++tangAge)+"��");
		
		//ȥ���������
		System.out.println("ȥ��ƿ�ӵ�������"+(--pingziAge)+"��");
		
		//���Ƕ�����������
		System.out.println("���Ƕ�������������"+Integer.MAX_VALUE+"��");
		
		//����֮ǰ����������
		System.out.println("����֮ǰ���������ڣ�"+Integer.MIN_VALUE+"��");
	}
}
