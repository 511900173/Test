package com.tedu.text06;

//˽�л����ԣ���ɫ���ͺţ�Ʒ�ƣ��۸�
//��Ϊ�������ɡ�����
//��������Ĵ�����ʹ��
public class Text1_Car {
	public static void main(String[] args) {
		Car b = new Car();
		b.setColor("��ɫ");
		b.setBrand("��Ʒ�");
		b.setModel("ѩ����");
		b.setPrice(500);
		System.out.println(b.getColor());
		System.out.println(b.getModel());
		System.out.println(b.getBrand());
		System.out.println(b.getPrice() + "Ԫ");
		b.drive();
		b.fly();
	}
}

class Car {
	private String color;// ��ɫ
	private String model;// �ͺ�
	private String brand;// Ʒ��
	private int price;// �۸�
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
		System.out.println("���Կ�");
	}

	public void fly() {
		System.out.println("���Է�");
	}
}
