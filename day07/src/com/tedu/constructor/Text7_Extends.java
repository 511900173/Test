package com.tedu.constructor;
//测试继承关系
public class Text7_Extends {
	public static void main(String[] args) {
//		Sub s = new Sub();
//		s.skin = "黄色";
//		System.out.println(s.skin);
//		System.out.println(s.language);
//		s.eat();
//		s.setNum(9981);
//		System.out.println(s.getNum());
		Sun s2 = new Sun();
		System.out.println(s2.language);
		System.out.println(s2.skin);
		s2.eat();
		s2.setNum(888888);
		System.out.println(s2.getNum());
	}
}
class Fu{
	private int num;
	{
		System.out.println(9527);
	}
	String skin;
	String language;
	public void eat() {
		System.out.println("吃肉");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}	
}
//通过extends关键字和父类发生继承关系
class Sub extends Fu{
	//继承就相当与把父类的功能复制了一份
	public void eat() {
		System.out.println("喝汤");
		System.out.println(super.language);
	}
}
class Sun extends Sub{
	{
		super.eat();
		System.out.println("什么鬼");
		super.setNum(777777);
		System.out.println(super.getNum());
	}
}
