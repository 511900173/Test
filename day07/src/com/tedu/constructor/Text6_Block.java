package com.tedu.constructor;
//测试局部代码块
public class Text6_Block {
	public static void main(String[] args) {
		// 测试Zoo对象
		Zoo z = new Zoo();
		z.show();
	}
}
class Zoo {
	{
		System.out.println(4);
	}
	public void show() {
		// 局部代码块
		System.out.println(3);
		{
			System.out.println(1);
		}
		System.out.println(2);
	}

	{
		System.out.println(5);
	}	
}
