package com.tedu.fors;

//测试for循环
public class Text7_For {

	public static void main(String[] args) {
		method1();// 打印1-10

	}

	// 创建method1方法
	public static void method1() {
		// for(开始条件;循环条件;更改条件;){循环体;}
		
		for (int i = 0; i <= 1000000; i++) {
			// i 代表当前取到的值 
			int a = (int) (Math.random()*100000);
				System.out.print(a);
			}
				System.out.println();
		
	}

}
