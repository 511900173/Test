package com.tedu.constructor;
//测试构造方法
public class Text1_Constructor {
	public static void main(String[] args) {
		// 测试Person对象
		// 在执行new Person() 时会自动调用构造方法
		Person p = new Person();
		// 当显示的提供了含参构造时， 无参数构造会被覆盖
		// 这时必须显示的提供無参构造
		Person p1 = new Person(18);
		Person p2 = new Person("小明");
	}
}
//创建人类
class Person {
	// 构造方法 :方法名和类名一致 修饰符 方法名 ([参数..]) {}
	// 作用1：用来创建对象 作用2：初始化对象
	public Person() { // 当提供了含参构造时，必须把無参构造显示的写出来
		int age = 007;
		System.out.println(age);
	}
	public Person(int a) {
		System.out.println(a);
	}
	public Person(String a) {
		System.out.println(a);
	}
}
