package com.tedu.breakcontinue;

import java.util.Random;
import java.util.Scanner;

//����whileѭ���ṹ
public class Text5_While {

	public static void main(String[] args) {
		// ��������� 0 1 2 --����3���ڵ�����
		int random = new Random().nextInt(100) + 1;// +1�����������1��ʼ
		System.out.println(random);
		// ����method()��ɱȽ�
		// method1(random);
		method2(random);

	}

	private static void method2(int num) {
		int input;
		do {
			input = new Scanner(System.in).nextInt();
			if (input > num) {
				System.out.println("����");
			}
			if (input < num) {
				System.out.println("С��");
			}

		} while (input != num);
		System.out.println("����");

	}

	// ������random��ֵ�Ƕ��پͻᴫ�ݸ�num
	private static void method1(int num) {
		// һֱ�����û�������
		while (true) { // ��ѭ��
			int input = new Scanner(System.in).nextInt();
			// �������ֵ�������ֵ��
			if (input > num) {
				System.out.println("����");
			} else if (input < num) {
				System.out.println("С��");
			} else if (input == num) {
				System.out.println("����");
				// ���ó������
				break;
			}

		}

	}

}
