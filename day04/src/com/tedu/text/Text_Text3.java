package com.tedu.text;

import java.util.Random;
import java.util.Scanner;

public class Text_Text3 {

	public static void main(String[] args) {
		method1();// 打印0-10和 10-0
		method2();// 打印8,88,888,8888
		method3();// 打印5行的正方形
		methdo4();// 打印左直角三角形
		method5();// 打印右直角三角形
		method6();// 打印全三角形
		method7();// 打印左直角三角形
		method8();// 打印99乘法表
		method9();// 计算0-100以内的奇数和
		method10();// 计算0-100以内的偶数个数
		int random = new Random().nextInt(100);
		System.out.println("请输入一个数");
		method11(random);

	}

	private static void method11(int num) {
		while (true) {
			int input = new Scanner(System.in).nextInt();
			if (input > num) {
				System.out.println("大了");
			}
			if (input < num) {
				System.out.println("小了");
			}
			if (input == num) {
				System.out.println("对了");
				break;
			}
		}

	}

	private static void method10() {
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				count++;
			}
		}
		System.out.println("0-100以内的偶数个数是：" + count);
	}

	private static void method9() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("0-100以内的奇数和是" + sum);
	}

	private static void method8() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}

	}

	private static void method7() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 14; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(0);
			}
			System.out.println();
		}
		for (int j = 1; j <= 7; j++) {
			for (int t = 21; t >= j; t--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= j * 2 - 1; k++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

	private static void method6() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

	private static void method5() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

	private static void methdo4() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

	private static void method3() {
		for (int i = 1; i <= 7; i++) {
			for (int j = 1; j <= 7; j++) {
				System.out.print(0);
			}
			System.out.println();
		}

	}

	private static void method2() {
		for (int i = 8; i < 999999; i = i * 10 + 8) {
			System.out.println(i);
		}

	}

	private static void method1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		for (int j = 10; j >= 0; j--) {
			System.out.println(j);
		}
	}

}
