package com.tedu.method;

import java.util.Scanner;

//����switch...case
public class Text6_Switch {

	public static void main(String[] args) {
		// ����method1()
		// method1();
		method2();
	}

	// ����method1()
	public static void method1() {
		// ���ҵ�ƥ���case���������͸��Ŷ��case
		// ����������break����������
		// switch(exprise)���ʽ��һ���������ʽ
		// ֻ֧��byte short char int , jdk1.7֮�������String
		@SuppressWarnings("resource")
		int a = new Scanner(System.in).nextInt();
		switch (a) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
		case 4:
			System.out.println(4);
		case 5:
			System.out.println(5);
			break;
		default:
			System.out.println("������");

		}

	}

	// ����method2()
	public static void method2() {
		char a = 'f';
		switch (a) {
		case 'a':
			System.out.println("A");
			break;
		case 'b':
			System.out.println("B");
			break;
		case 'c':
			System.out.println("C");
			break;
		case 'd':
			System.out.println("D");
			break;
		case 'e':
			System.out.println("E");
			break;
		case 'f':
			System.out.println("F");
			break;
		case 'g':
			System.out.println("G");
			break;
		default:
			System.out.println("��");

		}

	}

	public static void method3() {
		String a = "aa";
		switch (a) {
		case "aa":
			System.out.println("AA");
			break;

		}

	}

}
