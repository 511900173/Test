package com.tedu.basic;

import java.util.Scanner;

public class Text94 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("请输入第一个数：");
		int a=new Scanner(System.in).nextInt();
		System.out.println("请输入第二个数：");
		int b=new Scanner(System.in).nextInt();
		int t=a;
			a=b;
			b=t;
		System.out.println("两个数交换后");
		System.out.println("第一个数是："+a);
		System.out.println("第二个数是："+b);	
		
	}
}
