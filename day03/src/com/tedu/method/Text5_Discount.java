package com.tedu.method;

import java.util.Scanner;

//测试商品打折
public class Text5_Discount {

	public static void main(String[] args) {
		// 1，接收用户出入的原价
		// 2，调用method1()，完成算法，返回折后价
		@SuppressWarnings("resource")
		double price = new Scanner(System.in).nextDouble();
		double now = method1(price);
		System.out.println("折后价是" + now);

	}

	public static double method1(double a) {
		double b=1;
		if (a >= 5000) {
			b= 0.5;
		} else if (a >= 2000) {
			b= 0.8;
		} else if (a >= 1000) {
			b=0.9;
		}

		return a*b;
	}

}
