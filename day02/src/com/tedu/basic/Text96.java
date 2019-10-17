package com.tedu.basic;

import java.util.Scanner;

public class Text96 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("请输入三个数：");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		int c=new Scanner(System.in).nextInt();
		int max= (a>b?a:b)>c?(a>b?a:b):c;
		System.out.println("最大的数是："+max);
	}
}
