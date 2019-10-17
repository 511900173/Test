package com.tedu.oop;
//测试抽象类里方法的用法
public class Text5_Abstrcat {
	public static void main(String[] args) {
		Fu5 f = new Zi5();
		f.sleep();
		f.eat();
	}
}

abstract class Fu5{
	//普通方法
	public void eat() {
		System.out.println("刺激");
	}
	//抽象方法 -- 方法的声明/签名
	abstract public void sleep();
}

class Zi5 extends Fu5{
	//重写抽象方法
	public void sleep() {
		System.out.println("额外");
	}
}