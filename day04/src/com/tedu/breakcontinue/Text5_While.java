package com.tedu.breakcontinue;

import java.util.Random;
import java.util.Scanner;

//测试while循环结构
public class Text5_While {

	public static void main(String[] args) {
		// 产生随机数 0 1 2 --产生3以内的数据
		int random = new Random().nextInt(100) + 1;// +1是让随机数从1开始
		System.out.println(random);
		// 调用method()完成比较
		// method1(random);
		method2(random);

	}

	private static void method2(int num) {
		int input;
		do {
			input = new Scanner(System.in).nextInt();
			if (input > num) {
				System.out.println("大了");
			}
			if (input < num) {
				System.out.println("小了");
			}

		} while (input != num);
		System.out.println("中了");

	}

	// 将来的random的值是多少就会传递给num
	private static void method1(int num) {
		// 一直接受用户的输入
		while (true) { // 死循环
			int input = new Scanner(System.in).nextInt();
			// 拿着随机值和输入的值比
			if (input > num) {
				System.out.println("大了");
			} else if (input < num) {
				System.out.println("小了");
			} else if (input == num) {
				System.out.println("中了");
				// 设置程序出口
				break;
			}

		}

	}

}
