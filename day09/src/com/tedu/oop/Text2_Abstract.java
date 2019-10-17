package com.tedu.oop;

public class Text2_Abstract {

	public static void main(String[] args) {
		Fu1 f = new Sub1();
		f.eat();
		f.sleep();
	}
}

//抽象类中可以有普通方法也可以有抽象方法
//如果类中包含抽象方法，这个类必须是抽象类
abstract class Fu1 {
	// 普遍方法
	public void sleep() {
		System.out.println("睡觉");
	}
	// 抽象方法：没有方法体，需要被abstract修饰
	abstract public void eat();
}

//子类可以继承抽象类，
//子类要把抽象类中的抽象方法全部重写，否则子类还是抽象类，
class Sub1 extends Fu1 {
	public void eat() {
		System.out.println("吃肉肉");
	}

}