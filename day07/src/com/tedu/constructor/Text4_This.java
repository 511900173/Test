package com.tedu.constructor;
public class Text4_This {
	public static void main(String[] args) {
		//����Car����
		//Car c = new Car("��");
		//System.out.println(c.name);	
		Car c1 = new Car();
		c1.name="da";
	}
}
class Car{
	String name;
	public Car() {
		//this ������ڵ�һ��
		this("��Ʒ�");//ͨ��this���ú��ι���
		System.out.println(1);
	}
	public Car(String name) {
		//this();
		//this.name������ǳ�Ա�������ұߵ�name������Ǿֲ�����
		this.name=name;	
		System.out.println(name);
	}	
}


