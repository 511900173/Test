package com.tedu.text;

import java.util.Random;
import java.util.Scanner;

public class Text_Text1 {

	public static void main(String[] args) {
		method1();// ��ӡ0-10
		method2();// ��ӡ8,88,888,8888
		method3();// ��ӡ5�е�������
		methdo4();// ��ӡ��ֱ��������
		method5();// ��ӡ99�˷���
		method6();// ����0-100���ڵ�������
		method7();// ����0-100���ڵ�ż������
		method8();// ��ӡ��ֱ��������
		method9();// ��ӡȫ������
		method10();// ��ӡ��ֱ��������
		System.out.println("������һ�����֣�");
		int random = new Random().nextInt(100);
		method11(random);// ������
	}

	private static void method11(int num) {
		while (true) {
			int input = new Scanner(System.in).nextInt();
			if (input > num) {
				System.out.println("����");
			}
			if (input < num) {
				System.out.println("С��");
			}
			if (input == num) {
				System.out.println("����");
				break;
			}

		}

	}

	private static void method10() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 14; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void method9() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void method8() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void method7() {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("0-100���ڵ�ż�������ǣ�" + count);
	}

	private static void method6() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("0-100���ڵ��������ǣ�" + sum);
	}

	private static void method5() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}

	}

	private static void methdo4() {
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void method3() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	private static void method2() {
		for (int i = 0; i <= 888888; i = i * 10 + 8) {
			System.out.println(i);
		}

	}

	// ��ӡ10-0 �� 0-10
	private static void method1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}
	}

}
