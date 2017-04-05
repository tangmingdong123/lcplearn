package com.lcp.variant.bean;
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
public class VariantExample {
	/*
	 * ������ֱ�Ӷ���ı����г�Ա�������������
	 * �����ǰ����һ��static�ؼ���
	 * �ɼ�����������
	 * 		private��ֻ�е�ǰ�����ܷ��ʵ�
	 * 		protected��ֻ�е�ǰ��������ܷ��ʵ�
	 * 		public�����Ե��඼�ܷ��ʵ�
	 */
	private int privateAge = 18;		//��ʵ���䣬�Լ�֪����		private ��˽�У�ֻ��VariantExample�����ܿ���
	protected int protectedAge = 18;	//���꣬�Լ����Լ�������֪����	protected ��˽�У�ֻ��VariantExample��������ܿ���
	public int publicAge = 18;		//���꣬���⹫���ģ���Ҷ�֪����protected ��˽�У�ֻ��VariantExample��������ܿ���
	
	private static int instanceCount = 0;//���ʵ�����������������VariantExampleֻ����һ��
	public static String className = "VariantExample";
	
	public VariantExample(){
		instanceCount ++;
	}

	public static int getInstanceCount() {
		return instanceCount;
	}
	
	public void printPrivateAge(){
		//�Լ����Է����Լ���private���������������಻��
		System.out.println("private Age:"+privateAge);
	}
	
	//ѧϰ��������
	public void setPrivateAge(int privateAge/*�����privateAge��setRealAge������һ��������������������*/){
		this.privateAge = privateAge;//this��ʾ��ǰʵ����this.privateAge�ǵ�ǰʵ���ĳ�Ա����,��û��this.��privateAge�ǲ�������
	}
	//ѧϰ��������2
	public void setProtectedAge(int va/*�����va��setVirtaulAge������һ��������������������*/){
		protectedAge = va;//��setRealAge��ͬ����������û�����Ա����ͬ���ı���ʱ�����Բ���this.����ָ��virtualAge����ʡ�Գ�virtualAge��
	}
}
