package com.tedu.oop;

public class Text3_Extends {
	public static void main(String[] args) {
		Sub3 s = new Sub3();
	}
}

class Fu3 {
	/*
	 * public Fu3() { System.out.println(1); }
	 */
	public Fu3(int a) { // 提供了含参构造时 無参构造就没了
		System.out.println(3);
	}
}

class Sub3 extends Fu3 {
	public Sub3() {
		super(8);// super会自动去调用父类的無参构造
		System.out.println(2);
	}
}