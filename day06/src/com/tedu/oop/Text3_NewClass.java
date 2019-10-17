package com.tedu.oop;

//測試創建類和創建對象
public class Text3_NewClass {
	public static void main(String[] args) {
		// 创建人类对象,通过new关键字;
		// 这个p是引用类型，引用了person对象的地址值
		Person p = new Person();//刚创建出来的对象属性就是默认值
		// 修改属性的内容
		p.name = "熊大";
		p.gender = "男";
		p.age = 20;
		System.out.println(p.name);
		System.out.println(p.gender);
		System.out.println(p.age);
		// 调用对象的方法+-
		p.eat();
		p.sleep();
	}
}

//在一个Java文件中可以存在多个class；
//而且有一个class被public修饰
//而且文件名必须和public的类名一致

//通过class关键字定义类(一类事物的抽象)
class Person {
	// 属性(成员变量) + 行为(成员方法)
	String name;
	String gender;
	int age;
	// 行为(成员方法)
	public void eat() {
		System.out.println("吃饭饭");
	}
	public void sleep() {
		System.out.println("睡觉觉");
	}
}