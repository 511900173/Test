package com.tedu.basic;

import java.util.Scanner;

public class Text94 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("�������һ������");
		int a=new Scanner(System.in).nextInt();
		System.out.println("������ڶ�������");
		int b=new Scanner(System.in).nextInt();
		int t=a;
			a=b;
			b=t;
		System.out.println("������������");
		System.out.println("��һ�����ǣ�"+a);
		System.out.println("�ڶ������ǣ�"+b);	
		
	}
}
