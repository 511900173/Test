package com.tedu.breakcontinue;

import java.util.Scanner;

//测试break和continue
public class Text4_BreakCon {

	public static void main(String[] args) {
		method1();// 找数字88

	}

	private static void method1() {
		for (int i = 0; i < 100; i++) {

			// 接收键盘输入的数字
			int input = new Scanner(System.in).nextInt();
			// 判断数字是不是88
			if (input != 88) {
				// 继续输入
				continue;
			} else if (input == 88) {
				System.out.println("对了");
		 		break;// 结束
			}

		}
	}

}
