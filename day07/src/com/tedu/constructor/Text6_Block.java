package com.tedu.constructor;
//���Ծֲ������
public class Text6_Block {
	public static void main(String[] args) {
		// ����Zoo����
		Zoo z = new Zoo();
		z.show();
	}
}
class Zoo {
	{
		System.out.println(4);
	}
	public void show() {
		// �ֲ������
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
