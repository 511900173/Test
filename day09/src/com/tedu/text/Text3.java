package com.tedu.text;
//具体事物：培优班学员，高手班学员
//共性：姓名，学习，休假
//创建学员对象，调用提供的功能

public class Text3 {

	public static void main(String[] args) {
		Student s1 = new JsdStudent();
		s1.rest();
		s1.study();
		Student s2 = new CgbStudent();
		s2.rest();
		s2.study();
	}

}

abstract class Student{
	String name;
	public abstract void study();
	public abstract void rest();
}
class CgbStudent extends Student{
	@Override
	public void study() {
		System.out.println("学习cgb");
	}
	@Override
	public void rest() {
		System.out.println("休息1天");
	}
}
class JsdStudent extends Student{
	@Override
	public void study() {
		System.out.println("学习jsd");
	}
	@Override
	public void rest() {
		System.out.println("休息334");
	}
}