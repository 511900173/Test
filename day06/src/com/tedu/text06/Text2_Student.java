package com.tedu.text06;
//包含属性：姓名name和学号no
//包含行为：学习study和复习review
//测试：创建Student对象，重新设置属性的值，打印属性值和方法
public class Text2_Student {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("三好学生");
		s.setNo(9527);
		System.out.println(s.getName());
		System.out.println(s.getNo());
		s.study();
		s.review();

		Student s1 = new Student();
		s1.setName("瓜娃子");
		s1.setNo(250);
		System.out.println(s1.getName());
		System.out.println(s1.getNo());
		s1.study();
		s1.review();
		
	}

}

class Student{
	private String name;
	private int no;
	
	public void setName(String n) {
		name = n ; 
	}
	public String getName() {
		return name;
	}
	public void setNo(int n) {
		no = n ;
	}
	public int getNo() {
		return no;
	}
	
	public void study() {
		System.out.println("好好学习");
	}
	
	public void review() {
		System.out.println("天天向上");
	}
}




















