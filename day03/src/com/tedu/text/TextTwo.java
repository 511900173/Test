package com.tedu.text;

import java.util.Scanner;

/*
 * ��һ�����ӣ��ӳ��������������ÿ���¶���һ�����ӣ�
 * С���ӳ����������º�ÿ��������һ�����ӣ�
 * �������Ӷ���������ÿ���µ���������Ϊ����
 * 
 */
public class TextTwo {

	public static void main(String[] args) {
		
		int num;
		for (int i = 0; i < 24; i++) {
			num = method1(i);
			System.out.println(num);
		}

	}

	public static int method1(int i) {
		

		if ((i == 1)||(i==2)) {
			return 1;
		} else {
			return method1(i - 1)+method1(i - 2);
		}

	}

}
