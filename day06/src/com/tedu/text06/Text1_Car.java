package com.tedu.text06;

//私有化属性：颜色，型号，品牌，价格
//行为：开，飞。。。
//汽车对象的创建和使用
public class Text1_Car {
	public static void main(String[] args) {
		Car b = new Car();
		b.setColor("黄色");
		b.setBrand("大黄蜂");
		b.setModel("雪佛兰");
		b.setPrice(500);
		System.out.println(b.getColor());
		System.out.println(b.getModel());
		System.out.println(b.getBrand());
		System.out.println(b.getPrice() + "元");
		b.drive();
		b.fly();
	}
}

class Car {
	private String color;// 颜色
	private String model;// 型号
	private String brand;// 品牌
	private int price;// 价格
//	public void setColor(String c) {
//		color = c ;
//	}	
//	public String getColor() {
//		return color;
//	}
//	public void setModel(String c) {
//		model = c ;
//	}
//	public String getModel() {
//		return model;
//	}
//	public void setBrand(String c) {
//		brand = c ;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setPrice(int c) {
//		price = c;
//	}
//	public int getPrice() {
//		return price;
//	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void drive() {
		System.out.println("可以开");
	}

	public void fly() {
		System.out.println("可以飞");
	}
}
