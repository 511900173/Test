package com.tedu.method;

import java.util.Scanner;

//������Ʒ����
public class Text5_Discount {

	public static void main(String[] args) {
		// 1�������û������ԭ��
		// 2������method1()������㷨�������ۺ��
		@SuppressWarnings("resource")
		double price = new Scanner(System.in).nextDouble();
		double now = method1(price);
		System.out.println("�ۺ����" + now);

	}

	public static double method1(double a) {
		double b=1;
		if (a >= 5000) {
			b= 0.5;
		} else if (a >= 2000) {
			b= 0.8;
		} else if (a >= 1000) {
			b=0.9;
		}

		return a*b;
	}

}
