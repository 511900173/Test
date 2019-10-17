package com.tedu.oop;
//测试多态的使用
public class Text1_DuoTai {

	public static void main(String[] args) {
		Fu f = new Sub();
		// 编译看左边 运行看右边
		f.eat();//执行效果看子类 如果重写就是重写的效果
		//方法的使用：能用什么方法要看父类	
//		f.sleep();
		//成员变量的使用 多态中只能调用父类提供的功能
		System.out.println(f.num);
		//静态资源的使用 谁调用就是谁的 f是父类类型;
		System.out.println(f.age);
		System.out.println(Sub.age);//子类通过子类类名调用
	}
	
}
//前提：继承+重写
class Fu{
	static int age = 1000;
	int num = 10;
	public void eat(){
		System.out.println("吃肉肉");
	}
}
class Sub extends Fu{
	static int age = 2000;
	int num = 20;
	public void eat() {
		System.out.println("吃菜菜");
	}
	public void sleep() {
		System.out.println("jkfjkdjf");
	}
}