package com.lcp.type.number;

public class IntegerLearn {

	public static void main(String[] args) {
		//������
		printTangAndPingzi();
		printPingHome();
		
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
    public static void printPingHome(){
    	int daugherAge = 26;
    	int sonAge = 18;
    	int fatherAge = 49;
    	int motherAge = 49;
    	
    	//�����
    	System.out.println("����ͣ�"+(daugherAge+sonAge+fatherAge+motherAge)+"age");
    	//�ְ����������
    	System.out.println("�ְ���������"+(fatherAge-daugherAge)+"age");
    	//�ְ������ܵ�
    	System.out.println("�ְ������ܵ�"+Math.rint(fatherAge/sonAge)+"age");
    	//ȫ��ƽ������
    	System.out.println("ȫ��ƽ������"+(daugherAge+sonAge+fatherAge+motherAge)/4+"age");
    	for(int i=0;i<4;i++){
    		int[] a={26,18,49,49};
    		//5�������
        	System.out.println("5�������"+(a[i]+5)+"age");
    	}
    	
    }
}

    
