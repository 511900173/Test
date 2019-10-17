package com.tedu.oop;

import java.util.Arrays;

public class Text7_Final {

	public static void main(String[] args) {

	}
}

//被final修饰的类，不能被继承
//final class Zoo{
class Zoo {
	// 被final修饰的变量是个常量，不能被改变
	final String name = "小南瓜";

	// 2,被final修饰的方法，不能被重写
//	public final void eat() {
	public void eat() {
		System.out.println("放假");
		// name = "来了";
	}
}

class Zi extends Zoo {
	public final void eat() {
		// super.name = "地理";
		System.out.println(super.name);
		System.out.println("记得");
	}
}