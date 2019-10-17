package com.tedu.api;

import java.util.Scanner;

public class Text3_Regex {

	public static void main(String[] args) {
		// 接收用户输入的身份证号码
		String input;
		// 18位 --- 17个数字+数字/X
		// 如果和正则表达式匹配就提示OK..
		int count = 0;
		String regex = "\\d{17}[0-9X]";
		// 通过matches()匹配字符串和正则
		do {
			input = new Scanner(System.in).nextLine();
				if (!input.matches(regex)) {
					System.out.println("错误...");
				}
		} while (!input.matches(regex));
		System.out.println("OK...");
	}

}
