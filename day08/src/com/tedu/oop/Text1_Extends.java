package com.tedu.oop;
//测试继承中成员变量的用法
public class Text1_Extends {
	public static void main(String[] args) {
		Sub s = new Sub();
		s.show();

	}
}

class Fu{ //定义父类
	int sum = 30;
}

class Sub extends Fu{ // 定义子类
	int sum = 20;
	public void show() {
		int sum = 10;
		//变量的就近原则
		System.out.println(sum);
		//通过this调用本类中的成员变量sum
		System.out.println(this.sum);
		//通过super调用父类中的成员变量sum
		System.out.println(super.sum);
	}
}



