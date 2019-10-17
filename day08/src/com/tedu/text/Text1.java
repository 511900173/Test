package com.tedu.text;

//1、创建汽车类。提供启动、停止、运行功能
//2、创建子类，继承汽车类。覆盖/重写 启动和停止功能
//3、创建子类对象，进行子类的功能测试
//4、创建多态对象，进行功能测试
public class Text1 {
	public static void main(String[] args) {
		Bus b = new Bus();
		b.star();
		b.stop();
		b.run();
		Car c = new Bus();
		c.star();
		c.stop();
		c.run();
		b.star(8);
		b.stop(8,6);
	}
}

class Car {

	int age;
	
	public void star() {
		System.out.println("启动");
	}


	

	public void stop() {
		System.out.println("停止");
	}

	public void run() {
		System.out.println("运行");
	}
}

class Bus extends Car {

	int age;
	public void shar() {}
	public void star(int age) {
		this.age = age;
		super.age = age;
		System.out.println("起飞");
		System.out.println(this.age);
		
	}

	public void stop(int age ,int age1) {
		super.age = age;
		this.age = age1;
		System.out.println("降落");
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
