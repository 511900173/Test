package com.tedu.api;

//测试Object类的toString() equals()
public class Text1_Object {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(18);
		s.setName("立即");
		s.setId(10086);
		// 由于Student类中重写了toString()
		// 所以在输出类时不再是地址值而是属性值
		System.out.println(s);

		Student s1 = new Student();
		s1.setAge(18);
		s1.setName("立即");
		s1.setId(10086);

		System.out.println(s == s1);
		System.out.println(s.equals(s1));

	}

}

class Student {
	private int id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// 重写Object提供的toString()
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// 重写equals()
	// 默认提供的是比较对象的地址值
	// 如果对象的属性值完全相同那么肯定是一个对象
	@Override
	public boolean equals(Object obj) {
		// 判断两个对象的属性值如果相同就是true
		// 把Object强转成Student类型
		Student s = (Student) obj;

		// 拿s的属性和this的属性比
		return s.id == this.id && s.name == this.name && s.age == this.age;
	}

}