package com.tedu.constructor;
//测试构造方法赋值
public class Text2_Constructor {
	public static void main(String[] args) {
		//
		//把"小明"传给n 18传给a
		Student s = new Student("小明", 18);
		System.out.println(s.name);
		System.out.println(s.age);
	}
}
class Student {
	String name;
	int age;
	// 赋值方式1：利用set();
	public Student() {
	} // 方便new Student()创建对象
	// 赋值方式2：利用构造函数;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
