package com.tedu.basic;

import java.util.Scanner;

public class Text95 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("请输入年份：");
		int year=new Scanner(System.in).nextInt();
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+"是闰年");
		}else System.out.println(year+"是平年");
		 
	}
}
