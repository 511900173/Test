package com.tedu.constructor;
//this����ͬ������ʱ
public class Text3_This {
	public static void main(String[] args) {
		//����Teacher���󣬲���ֵ��
		Teacher t = new Teacher("ƤƤϼ",21);
		System.out.println(t.name);
		System.out.println(t.no);	
	}
}
class Teacher{	
	String name;
	int no;
	//�ֶ��ṩ�o�ι���
	public Teacher() {}
	//��ֵ��set() Teacher()
	public Teacher(String name, int no){
		//���ֲ��������ͳ�Ա��������ͬʱ
		//����ͨ��this�ؼ��ֵ��ó�Ա����
		//���򣬸��ݾͽ�ԭ�򣬻�һֱʹ�þֲ�����
		this.name = name ;
		this.no = no ;				
	}		
}
