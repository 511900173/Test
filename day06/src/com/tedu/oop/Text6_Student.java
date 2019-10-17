package com.tedu.oop;

public class Text6_Student {
	public static void main(String[] args) {
		//创建Student2对象
		Student2 s = new Student2();
		
//		System.out.println(s.name); // null
		//age 已经被private了，
//		System.out.println(s.age); // 0
		s.setAge(15);//设置age属性的值
		s.getAge();//获取age属性的值
		System.out.println(s.getAge());
		s.setName("什么鬼");
		System.out.println(s.getName());
	}
}

//创建Student2类

class Student2{
	private String name ;
	//被private修饰后，只能在本类中访问
	private int age;
	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	
	//修改age属性的可见范围
	//提供公共的setXxx()--获取属性值
	public void setAge(int a) {
		age = a ;//把age属性的值重新设置为a的值
	}
		
	//提供公共getXxx()--设置属性值
	public int getAge() {
	//通过return关键字，直接把age属性的值返回调用位置	
		return age;
	}
	
	
	
}

