package com.tedu.constructor;
//测试代码快(构造代码块(构造函数)/局部代码块)
public class Text5_Block {
	public static void main(String[] args) {
		//创建Animal对象
		//如果有有构造代码块，优先执行构造代码块再执行构造方法
		Animal a = new Animal();
		Animal a1 = new Animal();
	}
}
class Animal{
	/*构造代码块...*/
	{
		System.out.println(1);
	}	
	/*無参构造方法*/
	public Animal(){
		System.out.println(2);
	}	
}
