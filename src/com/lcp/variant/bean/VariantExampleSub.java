package com.lcp.variant.bean;

//����һ�����࣬���Է��ʸ���ĳ�Ա����
public class VariantExampleSub extends VariantExample{
	public void printPrivateAge(){
		//�ſ�����һ�е�ע�ͣ�����챨����ɫ��棩
		//System.out.println("Real Age:"+realAge);
		System.out.println("���ܷ���private����");
	}
	public void printProtectedAge(){
		//������Է���protected����
		System.out.println("protected Virtual Age:"+protectedAge);	
	}
	public void printPublicAge(){
		//������Է���public����
		System.out.println("public Full Age:"+publicAge);	
	}
}
