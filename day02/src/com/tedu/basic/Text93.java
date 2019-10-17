package com.tedu.basic;

import java.util.Scanner;

public class Text93 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入圆的半径：");
		double r=new Scanner(System.in).nextDouble();
		System.out.println("圆的面积是："+3.14*r*r);
		System.out.println("圆的周长是："+3.14*2*r);

	}

}
