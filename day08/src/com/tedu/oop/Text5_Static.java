package com.tedu.oop;
//测试静态资源和非静态资源之间的调用关系
public class Text5_Static {

	public static void main(String[] args) {
		
	}	
}

//创建人类
class Person{
	// 1,静态资源只能调用静态资源
	// 2,非静态资源都能调用
	static String name;
	int age;
	static public void eat() {
		//静态方法调不用非静态变量
		//System.out.println(age);
		System.out.println(1);
	}
	
	public void sleep() {
		//非静态资源能调用静态资源和非静态资源
		System.out.println(name);
		System.out.println(age);
		System.out.println(2);
	}
}

