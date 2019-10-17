package com.tedu.text;

import java.util.Scanner;

public class Text3 {
	static int mima;
	static String input;
	public static void main(String[] args) {
		System.out.println("设置4位数密码");
		mima = new Scanner(System.in).nextInt();
		System.out.println("请输入4位数密码");
		do {
			input = new Scanner(System.in).nextLine();
			if(input.equals(mima)) {
				System.out.println("正确");
			}else {
				System.out.println("错误");
			}
			
		}while (true);
		
	}

	@Override
	public boolean equals(Object obj) {
		boolean s = (String) obj != null;
		return s = input != null;
	}

}
