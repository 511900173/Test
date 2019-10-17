package com.tedu.oop;

public class Text4_NewClass {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "Ð¡Ã÷";
		s.no= 123456;
		System.out.println(s.name);
		System.out.println(s.no);
		s.study();
		s.review();
		
	}

}

class Student{
	String name;
	int no;
	public void study() {
		System.out.println("Ñ§Ï°");
	}
	public void review() {
		System.out.println("¸´Ï°");
	}
}
