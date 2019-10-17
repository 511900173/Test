package com.tedu.basic;

import java.util.Scanner;

public class Text92 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("请输入名字：");
		String name=new Scanner(System.in).next();
		System.out.println("请输入年龄：");
		byte age=new Scanner(System.in).nextByte();
		System.out.println("请输入工资：");
		double money = new Scanner(System.in).nextDouble();
		System.out.println("大家好，我是"+name+",今年"+age+"岁，工资是"+money+"元。");	
		
	}
}
