package com.tedu.oop;
//测试继承中成员方法的用法
public class Text2_Extends {

	public static void main(String[] args) {
		Sub2 s = new Sub2();
		s.eat();//子类重写了eat()，从此eat()的实现就覆盖掉了父类的原有功能
		s.study();//子类还可以调用自己的功能可以调用父类的功能
		
	}

}

class Fu2{
	public void eat() {
		System.out.println("吃肉");
	}
}

class Sub2 extends Fu2{
	//子类特有的功能
	public void study() {
		System.out.println("学习");
	}
	//重写（方法生命和父类完全一致）：修改父类原有的功能
	public void eat() {
		super.eat();//仍然可以通过super调用原有功能
		System.out.println("别吃");
	}
	
}
                                                                       