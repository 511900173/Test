package com.tedu.text;

import java.util.Scanner;

public class TextOne {

	public static void main(String[] args) {
		method1(); // �������������
		method2(); // if ��Ʒ����
		method3(); // switch ����ƥ��
		method4(); // ���� �Լ�
		method5(); // ��ӡ 10-0 0-10
		method6(); // ��ӡ8,88,888,8888
		method7(); // 0-100�е���������
		method8(); // 0-100��ż���ĺ�
		method9(); // 0-100�ĺ�
	}

	public static void method1() {
		System.out.println("��������������");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		int max;
		max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("��������" + max);
	}

	public static void method2() {
		System.out.println("�������");
		double price = new Scanner(System.in).nextDouble();
		double now;
		if (price >= 5000) {
			now = price * 0.5;
		} else if (price >= 2000) {
			now = price * 0.7;
		} else if (price >= 1000) {
			now = price * 0.9;
		} else {
			now = price;
		}
		System.out.println("���յļ۸���" + now);
	}

	public static void method3() {
		System.out.println("������һ������");
		int a = new Scanner(System.in).nextInt();
		switch (a) {
		case 1:
			System.out.println("��һ");
			break;
		case 2:
			System.out.println("�ڶ�");
			break;
		case 3:
			System.out.println("����");
			break;
		default:
			System.out.println("û�д���");
			break;

		}
	}

	public static void method4() {
		int a = 5, b = 6, c = 7;
		System.out.println(a++ + b-- + --c + ++a);
		System.out.println(++a + b++ + c + ++b);
		System.out.println(--a + ++b + c++ + a);
	}

	public static void method5() {
		System.out.println("��ӡ0-10:");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("��ӡ10-0:");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void method6() {
		System.out.println("��ӡ8,88,888,8888");
		for (int i = 8; i < 88888; i = i * 10 + 8) {
			System.out.println(i);
		}
	}

	public static void method7() {
		System.out.println("0-100�е����������ǣ�");
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("�����ĸ�����" + count);
	}

	public static void method8() {
		System.out.println("0-100��ż���ĺ��ǣ�");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("ż������" + sum);
	}
	
	public static void method9() {
		System.out.println("0-100�ĺ�");
		int sum=0;
		for (int i = 0; i <= 100; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
