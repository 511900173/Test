package com.tedu.oop;
//���Խӿڵ��÷�
public class Text8_Interface {
	public static void main(String[] args) {
		Fu8 f = new Zi8();
//		f.name = "���";//�ӿ���ı������ǳ���
		//�ӿ���ı������Ǿ�̬�Ŀ���ͨ������.����
		System.out.println(Fu8.name);
	}
}
//����ӿ�
interface Fu8{ 
	//�ӿ��ﲻ�ܶ��幹�췽��
//	public  Fu8() ;
	// �ӿ��ﶼ�ǳ��� ������ᱻpublic static final ����
	public static final String name = "ϰ��";
	// �ӿ���ķ������ǳ���� ���Զ����� static public�Զ��ӿ���ʡ��
	void save();
}
//��������ʵ�ֽӿ�
class Zi8 implements Fu8{
	public void save() {}
}