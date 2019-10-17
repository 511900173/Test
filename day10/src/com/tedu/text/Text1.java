package com.tedu.text;

public class Text1 {

	public static void main(String[] args) {
		Fu f = new Fu();
		System.out.println(f);
		
	}

}

class Fu{
	int age;
	int id;
	String name;
	public void eat() {
		System.out.println("³Ô");
	}
	@Override
	public String toString() {
		return "Fu [age=" + age + ", id=" + id + ", name=" + name + "]";
	}
}
