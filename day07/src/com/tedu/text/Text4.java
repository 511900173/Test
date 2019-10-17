package com.tedu.text;

public class Text4 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println("--eat改写---");
		c.eat();
		System.out.println("----------");
		C c1 = new C(8);
		System.out.println("----------");
	}

}

class A{
	String name;
	int age;
	double no;
	double a;
	private int num;
	{
		System.out.println(10001);
	}
	{
		no = 0.001;
	}
	public A() {
		System.out.println(10002+no);
	}
	public A(int a) {
		System.out.println(10003+no);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void eat() {
		System.out.println(10005+no);
	}
}

class B extends A{
	
}
class C extends B{
	double a = 0.1;
	{
		System.out.println(10007);
	}
	public C() {}
	public C(int a) {
		System.out.println(10004+super.no+this.a);
	}
	public void eat() {	//方法的重写
		System.out.println(10006+super.no);
	}
	
}





