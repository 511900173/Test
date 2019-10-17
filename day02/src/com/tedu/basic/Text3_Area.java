package com.tedu.basic;

import java.util.Scanner;

public class Text3_Area {

	public static void main(String[] args) {

		System.out.println("请输入半径：");
		//定义double类型变量记录半径
		@SuppressWarnings("resource")
		//接受键盘输入的半径
		double r=new Scanner(System.in).nextDouble();
		//输出面积，直接带入公式
		System.out.println("圆的面积是"+3.14*r*r);
		//输出周长，直接带入公式
		System.out.println("圆的周长是"+3.14*r*2);
		//String str=new Scanner(System.in).next();
		//System.out.println(str);

	}

}
