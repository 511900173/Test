package com.tedu.oop;
//测试多态的入门案例
public class Text8_DuoTai {

	public static void main(String[] args) {
		Fa ff = new Fa();
		ff.eat();
		Sa ss = new Sa();
		ss.eat();
		Fa f = new Sa();//创建多态对象/向上造型/向上转型
		f.eat();// 具体干活的是子类
//		f.show();//统一调用标准，向父类看齐  
		int 数字 = 3;
		System.out.println(数字);
		System.out.println("321"+(12+12));
	}

}

class Fa{
	public void eat() {
		System.out.println("吃什么");
	}
}

class Sa extends Fa{
	public void show() {
		System.out.println("戴假发");
	}
	public void eat() {
		System.out.println("吃佛跳墙");
	}
}


