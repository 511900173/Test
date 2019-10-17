package com.tedu.yuansuan;

//测试自增自减
public class Text2_ZiZeng {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a++);// ++在后，先取值后自增

		int b = 1;
		System.out.println(++b);// ++在前，先自增后取值

		System.out.println(++a + b + b++ + ++a + b + b++);
		// 3 +2+2 + 4 +3+3
		int c = 1;
		System.out.println(c--);

		int d = 1;
		System.out.println(--d);

		System.out.println(--c - d--);

	}

}
