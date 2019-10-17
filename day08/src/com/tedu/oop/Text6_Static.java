package com.tedu.oop;
//测试静态代码块
public class Text6_Static {
	static String s = "345";
	public static void main(String[] args) {
		new Animal();
//		System.out.println(Animal.name);
		new Animal();
//		System.out.println(Animal.name);
		//创建了两次对象但是静态代码块至执行了一次
		System.out.println(s);
	}

}


class Animal{
	static String name = "李四";
	static {
		System.out.println(name);
	}
	public Animal() {
		System.out.println(1);
	}
}