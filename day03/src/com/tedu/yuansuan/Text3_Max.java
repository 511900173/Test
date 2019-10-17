package com.tedu.yuansuan;

import java.util.Scanner;

//取三个数中的最大值
public class Text3_Max {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 接收键盘输入的a b c
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
//		int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);

	}

}
