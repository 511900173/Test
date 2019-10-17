package com.tedu.method;

//测试方法
public class Text4_Method {

	public static void main(String[] args) {
		System.out.println(1);
		// 调用指定方法
		// method1();
		// method2(10d);//方法的参数
		int result = method3(100);// 有返回值的方法
		System.out.println(result);
		String desc = method4("我爱学习");
		System.out.println(desc);

		System.out.println(2);

	}

	// 创建方法， 这个方法不调用是不会执行的
	public static void method1() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}

	// 创建方法2,并且把参数传递给a
	// 在创建方法时需要指定参数类型和参数名
	public static void method2(double a) {
		System.out.println(a * a);

	}

	// 创建method3
	public static int method3(int num) {
		num = num * num * num ;
		// 通过return 关键字，把结果返回给调用位置保存
		return num;
	}

	public static String method4(String qqq) {
		qqq = "吴天";
		return qqq;

	}

}
