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
	public Fu3(int a) { // �ṩ�˺��ι���ʱ �o�ι����û��
		System.out.println(3);
	}
}

class Sub3 extends Fu3 {
	public Sub3() {
		super(8);// super���Զ�ȥ���ø���ğo�ι���
		System.out.println(2);
	}
}