package com.tedu.basic;
//����ȡֵ��Χ 
public class Text1_Scope {

	public static void main(String[] args) {
		//���������¼���ֵ��Сֵ
		//��Ҫ�أ��������� ������=����ֵ
		//���������¼byte���͵����ֵ
		byte bmax=Byte.MAX_VALUE;
		byte bmin=Byte.MIN_VALUE;
		//��ӡ������ֵ   syso alt+/ ��ݼ� 
		System.out.println(bmax);// 127
		System.out.println(bmin);// -128
		
		short smax=Short.MAX_VALUE;//32767
		short smin=Short.MIN_VALUE;//-32768
		System.out.println(smax);
		System.out.println(smin);
		
		int imax=Integer.MAX_VALUE;//2147483647
		int imin=Integer.MIN_VALUE;//-2147483648
		System.out.println(imax);
		System.out.println(imin);
		
		long lmax=Long.MAX_VALUE;//9223372036854775807
		long lmin=Long.MIN_VALUE;//-9223372036854775808
		System.out.println("long");
		System.out.println(lmax);
		System.out.println(lmin);
		
		float fmax=Float.MAX_VALUE;//3.4028235E38
		float fmin=Float.MIN_VALUE;//1.4E-45
		System.out.println(fmax);
		System.out.println(fmin);
		
		double dmax=Double.MAX_VALUE;//1.7976931348623157E308
		double dmin=Double.MIN_VALUE;//4.9E-324
		System.out.println(dmax);
		System.out.println(dmin);
		
		
		char c1='h';//�ַ��� ' �ַ�
		char c2='o';
		char c3='��';//char���Դ�һ������
		char c4=65;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		//�ַ��������յ�����������һ���ַ�
		//�ܹ���98������ַ�b��
		//��Ϊchar���͵ײ���ascii���
		//ascii�����涨��0-127��Ӧ���ַ���
		//�����û�е����֣������գ�����ַ�������
		
		boolean boomax=true;
		boolean boomin=false;
		System.out.println(boomax);
		System.out.println(boomin);
		/*
		 * byte     1���ֽ�
		 * short    2���ֽ�
		 * integer  4���ֽ�
		 * long     8���ֽ�
		 * float    4���ֽ�
		 * double   8���ֽ�
		 * char     1���ֽ�
		 * boolean  2���ֽ�
		 */
		

	}

	
	
	
	
	
	
	
	
}
