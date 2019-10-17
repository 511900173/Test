package com.tedu.yuansuan;

import java.util.Scanner;

//测试平年闰年
public class Test1_Year {

	public static void main(String[] args) {
		// 提示用户输入的年份
		System.out.println("请输入年份：");
		// 接收用户输入的年份
		@SuppressWarnings("resource")
		int year = new Scanner(System.in).nextInt();
		String desc = "平年";// 设置默认就是平年
		// if(判断条件){满足条件的代码}
		// 判断是不是闰年
		// 可以被4整除 并且不能被100整除 或者可以被400整除
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// 设置为闰年
			desc = "闰年";
		}

		System.out.println("" + year + "年是" + desc + "");
	}

}
