package com.lcp.variant;

import java.util.Date;

import com.lcp.variant.bean.VariantExample;
import com.lcp.variant.bean.VariantExampleSub;

/**
 * ѧϰ����
 * 
	��������
		����1�����ʷ���+����+���ƣ�
		����2�����ʷ���+����+���� = ��ʼֵ
	��Ա���� vs �����
	�������� vs �����ڱ���
	��������
	final���� vs ����
	������������(�㶨��ı������Ķ��ܿ���)
	
 * @author Administrator
 *
 */
public class VariantTest {
	public static final String author = "Tang";//��������ߣ�final�����ɱ���������
	public final Date currentDate = new Date();//�����ö����ϵͳʱ�䣬final�����ɱ��

	public static void main(String[] args) {
		//������������ã����� + . + ������
		//�������public ����
		System.out.println("VariantExample��������"+VariantExample.className);
		
		//�������private ����, �ǲ�����ģ����뱨��
		//System.out.println("VariantExample��������"+VariantExample.instanceCout);
		
		//�������private ����,����ͨ�������һ��public��get/set����
		//�෽�������static���������ã����� + . + ���������� + (����...)
		System.out.println("VariantExample��ʵ������"+VariantExample.getInstanceCount());
		
		//ÿ��new VariantExampleSubʱ��InstanceCount����������
		VariantExampleSub sub = new VariantExampleSub();
		System.out.println("VariantExample��ʵ������"+VariantExample.getInstanceCount());
		
		sub = new VariantExampleSub();
		System.out.println("VariantExample��ʵ������"+VariantExample.getInstanceCount());
		
		//��ʾ��Ա�����Ŀɼ���
		sub.printPrivateAge();//���಻�ܷ���private����
		sub.printProtectedAge();//�����ܷ���protect����
		sub.printPublicAge();//�����ܷ���public����
		
		//System.out.println("sub.protectedAge="+sub.privateAge);//�������࣬���ܷ���private����
		//System.out.println("sub.protectedAge="+sub.protectedAge);//�������࣬���ܷ���protected����
		System.out.println("sub.publicAge="+sub.publicAge);//�����඼�ܷ���public����
		
		
		//������ĳ�Ա������ѧϰ�����������Լ������������Ա����ͬ��ʱ�����⴦��
		sub.setPrivateAge(15);
		sub.setProtectedAge(33);
		
		//final��������ʾ���ɱ�ı������������Ϊ������
		final int tempFinalAge = 15;
		
		//����һ�в�ע�ͻᱨ��,final������ʼ��֮�󲻵øı�ֵ
		//tempFinalAge = 16;
		
		final int tempFinalAge2;
		tempFinalAge2 = 18;//��һ�ж��壬��һ�и�ֵ�����ԣ���
		
		//final�����������������Ա��������ʱ��������������
		int age = 15;
		showFinalParam(age);
		
		//main������static���������÷�λ��static��������ע�ͻᱨ��
		//System.out.println("currentDate="+currentDate);
		
		//main������static���������Է���static����
		System.out.println("currentDate="+VariantTest.author);
		
		//����������˴����{}�Ͳ��ܷ�����
		{
			String name = "Lichunping";
			System.out.println("block variant name="+name);
		}
		//���name�Ѿ������ڣ����Բ��ܷ�����
		//System.out.println("block variant outside, name="+name);
	}
	
	public static void showFinalParam(final int param){
		//final�������ɸ���,��ע�ͻᱨ��
		//param = 15;
	}

}
