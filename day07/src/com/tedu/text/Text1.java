package com.tedu.text;

public class Text1 {

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("¾øµØÇóÉú");
		Person p2 = new Person(1000);
		Person p3 = new Person(8,8);
	}
}

class Person{
	public Person() {
		int age  = 1 ; 
		System.out.println(age);
	}
	public Person(String name) {
		System.out.println(name);
	}
	public Person(int a) {
		System.out.println(a);
	}
	public Person(int a, int b) {
		System.out.println(a*b);
	}
}

