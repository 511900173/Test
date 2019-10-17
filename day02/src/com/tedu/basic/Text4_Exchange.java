package com.tedu.basic;

import java.util.Scanner;

public class Text4_Exchange {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//接收用户输入的整数a
		int a = new Scanner(System.in).nextInt();
		//接收用户输入的整数b
		int b = new Scanner(System.in).nextInt();
		//交换变量的值
		// = 是从右向左运算 把右边的值交给左边保存
		int t=a;//创建临时变量t 保存a的值
			a=b;//把b的值交给a
			b=t;//把t的值交给b
		//打印a和b的值
		System.out.println(a);
		System.out.println(b);
	}




}
