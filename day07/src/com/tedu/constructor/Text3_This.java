package com.tedu.constructor;
//this用于同名变量时
public class Text3_This {
	public static void main(String[] args) {
		//产生Teacher对象，并赋值；
		Teacher t = new Teacher("皮皮霞",21);
		System.out.println(t.name);
		System.out.println(t.no);	
	}
}
class Teacher{	
	String name;
	int no;
	//手动提供無参构造
	public Teacher() {}
	//赋值：set() Teacher()
	public Teacher(String name, int no){
		//当局部变量名和成员变量名相同时
		//可以通过this关键字调用成员变量
		//否则，根据就近原则，会一直使用局部变量
		this.name = name ;
		this.no = no ;				
	}		
}
