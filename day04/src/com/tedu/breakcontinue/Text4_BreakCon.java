package com.tedu.breakcontinue;

import java.util.Scanner;

//����break��continue
public class Text4_BreakCon {

	public static void main(String[] args) {
		method1();// ������88

	}

	private static void method1() {
		for (int i = 0; i < 100; i++) {

			// ���ռ������������
			int input = new Scanner(System.in).nextInt();
			// �ж������ǲ���88
			if (input != 88) {
				// ��������
				continue;
			} else if (input == 88) {
				System.out.println("����");
		 		break;// ����
			}

		}
	}

}
