package com.tedu.oop;

public class Text6_Student {
	public static void main(String[] args) {
		//����Student2����
		Student2 s = new Student2();
		
//		System.out.println(s.name); // null
		//age �Ѿ���private�ˣ�
//		System.out.println(s.age); // 0
		s.setAge(15);//����age���Ե�ֵ
		s.getAge();//��ȡage���Ե�ֵ
		System.out.println(s.getAge());
		s.setName("ʲô��");
		System.out.println(s.getName());
	}
}

//����Student2��

class Student2{
	private String name ;
	//��private���κ�ֻ���ڱ����з���
	private int age;
	public void setName(String a) {
		name = a;
	}
	public String getName() {
		return name;
	}
	
	//�޸�age���ԵĿɼ���Χ
	//�ṩ������setXxx()--��ȡ����ֵ
	public void setAge(int a) {
		age = a ;//��age���Ե�ֵ��������Ϊa��ֵ
	}
		
	//�ṩ����getXxx()--��������ֵ
	public int getAge() {
	//ͨ��return�ؼ��֣�ֱ�Ӱ�age���Ե�ֵ���ص���λ��	
		return age;
	}
	
	
	
}

