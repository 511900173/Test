package com.tedu.api;

import java.util.Scanner;

public class Text3_Regex {

	public static void main(String[] args) {
		// �����û���������֤����
		String input;
		// 18λ --- 17������+����/X
		// �����������ʽƥ�����ʾOK..
		int count = 0;
		String regex = "\\d{17}[0-9X]";
		// ͨ��matches()ƥ���ַ���������
		do {
			input = new Scanner(System.in).nextLine();
				if (!input.matches(regex)) {
					System.out.println("����...");
				}
		} while (!input.matches(regex));
		System.out.println("OK...");
	}

}
