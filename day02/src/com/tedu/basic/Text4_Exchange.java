package com.tedu.basic;

import java.util.Scanner;

public class Text4_Exchange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//�����û����������a
		int a = new Scanner(System.in).nextInt();
		//�����û����������b
		int b = new Scanner(System.in).nextInt();
		//����������ֵ
		// = �Ǵ����������� ���ұߵ�ֵ������߱���
		int t=a;//������ʱ����t ����a��ֵ
			a=b;//��b��ֵ����a
			b=t;//��t��ֵ����b
		//��ӡa��b��ֵ
		System.out.println(a);
		System.out.println(b);
	}




}
