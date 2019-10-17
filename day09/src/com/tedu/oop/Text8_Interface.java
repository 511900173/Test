package com.tedu.oop;
//测试接口的用法
public class Text8_Interface {
	public static void main(String[] args) {
		Fu8 f = new Zi8();
//		f.name = "多久";//接口里的变量都是常量
		//接口里的变量都是静态的可以通过类名.调用
		System.out.println(Fu8.name);
	}
}
//定义接口
interface Fu8{ 
	//接口里不能定义构造方法
//	public  Fu8() ;
	// 接口里都是常量 隐藏这会被public static final 修饰
	public static final String name = "习惯";
	// 接口里的方法都是抽象的 会自动补齐 static public自动加可以省略
	void save();
}
//定义子类实现接口
class Zi8 implements Fu8{
	public void save() {}
}