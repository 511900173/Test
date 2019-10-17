package com.tedu.text;

import java.util.Scanner;

public class TextOne {

	public static void main(String[] args) {
		method1(); // 三个数的最大数
		method2(); // if 商品打折
		method3(); // switch 数字匹配
		method4(); // 自增 自减
		method5(); // 打印 10-0 0-10
		method6(); // 打印8,88,888,8888
		method7(); // 0-100中的奇数个数
		method8(); // 0-100中偶数的和
		method9(); // 0-100的和
	}

	public static void method1() {
		System.out.println("请输入三个数：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int c = new Scanner(System.in).nextInt();
		int max;
		max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("最大的数是" + max);
	}

	public static void method2() {
		System.out.println("请输入金额：");
		double price = new Scanner(System.in).nextDouble();
		double now;
		if (price >= 5000) {
			now = price * 0.5;
		} else if (price >= 2000) {
			now = price * 0.7;
		} else if (price >= 1000) {
			now = price * 0.9;
		} else {
			now = price;
		}
		System.out.println("最终的价格是" + now);
	}

	public static void method3() {
		System.out.println("请输入一个数：");
		int a = new Scanner(System.in).nextInt();
		switch (a) {
		case 1:
			System.out.println("第一");
			break;
		case 2:
			System.out.println("第二");
			break;
		case 3:
			System.out.println("第三");
			break;
		default:
			System.out.println("没有此数");
			break;

		}
	}

	public static void method4() {
		int a = 5, b = 6, c = 7;
		System.out.println(a++ + b-- + --c + ++a);
		System.out.println(++a + b++ + c + ++b);
		System.out.println(--a + ++b + c++ + a);
	}

	public static void method5() {
		System.out.println("打印0-10:");
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("打印10-0:");
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}

	public static void method6() {
		System.out.println("打印8,88,888,8888");
		for (int i = 8; i < 88888; i = i * 10 + 8) {
			System.out.println(i);
		}
	}

	public static void method7() {
		System.out.println("0-100中的奇数个数是：");
		int count = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				count++;
			}
		}
		System.out.println("奇数的个数是" + count);
	}

	public static void method8() {
		System.out.println("0-100中偶数的和是：");
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("偶数和是" + sum);
	}
	
	public static void method9() {
		System.out.println("0-100的和");
		int sum=0;
		for (int i = 0; i <= 100; i++) {
			sum+=i;
			System.out.println(sum);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
