package com.tedu.constructor;
public class Text4_This {
	public static void main(String[] args) {
		//测试Car对象
		//Car c = new Car("大");
		//System.out.println(c.name);	
		Car c1 = new Car();
		c1.name="da";
	}
}
class Car{
	String name;
	public Car() {
		//this 必须放在第一句
		this("大黄蜂");//通过this调用含参构造
		System.out.println(1);
	}
	public Car(String name) {
		//this();
		//this.name代表的是成员变量，右边的name代表的是局部变量
		this.name=name;	
		System.out.println(name);
	}	
}


