package com.tedu.oop;

//创建多个对象
public class Text5_NewMore {

	public static void main(String[] args) {
		Teacher t = new Teacher(); // 创建对象
		t.teachNo = 1008; // 给属性赋值
		t.name = "王海涛";

		Teacher t1 = new Teacher();// 创建第二个对象
		t1.name = "张三";
		t1.teachNo = 10086;
	}

}

class Teacher { // 创建类
	int teachNo;
	String name;

	public void show() {
		System.out.println("正在上课？？？");
	}

}
