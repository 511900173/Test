package com.tedu.oop;
//测试借口的入门案例
public class Text7_Interface {
	public static void main(String[] args) {
		Fu7 f = new Zi7();
		f.eat();
		f.sleep();
	}
}
//通过interface关键字定义借口
interface Fu7{
	//接口里全都是抽象方法
	abstract public void eat();
	abstract public void sleep();
}
	
class Zi7 implements Fu7{
	@Override//注解 @
	public void eat() {	
		System.out.println("刺激");
	}
	@Override
	public void sleep() {		
		System.out.println("金飞达");
	}

}