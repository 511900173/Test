package com.tedu.yuansuan;

//���������Լ�
public class Text2_ZiZeng {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a++);// ++�ں���ȡֵ������

		int b = 1;
		System.out.println(++b);// ++��ǰ����������ȡֵ

		System.out.println(++a + b + b++ + ++a + b + b++);
		// 3 +2+2 + 4 +3+3
		int c = 1;
		System.out.println(c--);

		int d = 1;
		System.out.println(--d);

		System.out.println(--c - d--);

	}

}
