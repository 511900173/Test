package com.tedu.text;

public class Text2_Equal {

	public static void main(String[] args) {
		Fu1 f1 = new Zi1();
		Fu1 f2 = new Zi2();
		f1.age = 18;
		f2.age = 18;
		f1.id = 1;
		f2.id = 1;
		f1.name = "qq";
		f2.name = "qq";
		
		
		
		
		if (f1.equals(f2)) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		

	}
}
abstract class Fu1{
	int age;
	int id;
	String name;
	abstract public void eat();
	abstract public void run();
	
}
class Zi1 extends Fu1{
	@Override
	public void eat() {
		System.out.println(1);	
	}
	@Override
	public void run() {
		System.out.println(2);	
	}	
}
class Zi2 extends Fu1{
	@Override
	public void eat() {
		System.out.println(3);
	}
	@Override
	public void run() {
		System.out.println(4);
	}
}