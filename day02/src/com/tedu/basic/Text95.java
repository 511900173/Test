package com.tedu.basic;

import java.util.Scanner;

public class Text95 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("��������ݣ�");
		int year=new Scanner(System.in).nextInt();
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.println(year+"������");
		}else System.out.println(year+"��ƽ��");
		 
	}
}
