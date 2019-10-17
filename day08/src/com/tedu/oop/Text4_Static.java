package com.tedu.oop;

public class Text4_Static {
	public static void main(String[] args) {
		// 1，静态资源优先于对象加载(没创建对象也能用静态的)
		// 4，可以直接被类名调用
		Student.name = "小明";
		System.out.println(Student.name);
		// 3，只加载一次
		Student s = new Student();
		Student s2 = new Student();
		// 如果只加载一次应该内存地址都一样
		// 通过==判断两个对象的地址值是否相同
		// 得到true说明内存中只有一份静态资源name
		// 给s.name赋值，s2.name的值和s.name一样 说明他俩是一个name
		s.name = "jfdkjlfs";
		System.out.println(s2.name);
		
	}
}
//创建类
class Student {
	// 用staitc关键字把属性变成静态的
	static String name;
	int age;

	public void eat() {
		System.out.println("吃饭");
	}

	// 静态方法
	public static void sleep() {
		System.out.println("睡觉");
	}
}