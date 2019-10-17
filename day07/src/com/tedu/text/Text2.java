package com.tedu.text;
//测试构造方法赋值
public class Text2 {
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student("小明",80);
		s1.name = "奥特曼";
		s1.no = 800;
		System.out.println(s1.name+s1.no);
	}
}

class Student{
	String name;
	int no;
	public Student() {}
	public Student(String name,int no) {
		this.name=name;
		this.no=no;
		System.out.println(name+no);
	}
}