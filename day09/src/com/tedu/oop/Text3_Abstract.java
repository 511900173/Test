package com.tedu.oop;

public class Text3_Abstract {
	public static void main(String[] args) {
		Fu3 f = new Zi3();
		
	}
}

abstract class Fu3{
	//抽象类自己是不能创建对象的
	//因为子类创建对象时会调用构造函数中的super()
	//抽象类中的构造方法用来给子类创建对象
	public Fu3() {
		System.out.println("放假");
	}
}
class Zi3 extends Fu3{
	//
	public Zi3() {
		//super();
		System.out.println("临时");
	}
}