package com.tedu.for2;

//for循环练习
public class Text1_For {

	public static void main(String[] args) {
//		method1();//打印10-0
		method2();// 打印8,88,888,8888

	}

	// 打印8,88,888,8888
	private static void method2() {
		for (int i = 8; i <= 8888888; i = i * 10 + 8) {
			System.out.println(i);
		}

	}

	// 打印10到0
	public static void method1() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}

	}

}
