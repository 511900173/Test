package com.tedu.text;
//具体事物：宝马汽车，奥迪汽车
//共性：颜色，型号，启动方法，跑方法
//创建汽车对象，调用提供的功能

public class Text4 {
	public static void main(String[] args) {
		Car c1 = new AoCar();
		c1.star();
		c1.run();
		Car c2 = new BmwCar();
		c2.star();
		c2.run();//  0 0 0 1 1 1
	}
}

abstract class Car{
	String color;
	String model;
	public abstract void star();
	public abstract void run();
}
class AoCar extends Car{
	public void star() {
		System.out.println("声音启动");
	}
	public void run() {
		System.out.println("百米2.5");
	}
}
class BmwCar extends Car{
	public void star() {
		System.out.println("人脸启动");
	}
	public void run() {
		System.out.println("百米9.9");
	}
}