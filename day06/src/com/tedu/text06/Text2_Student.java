package com.tedu.text06;
//�������ԣ�����name��ѧ��no
//������Ϊ��ѧϰstudy�͸�ϰreview
//���ԣ�����Student���������������Ե�ֵ����ӡ����ֵ�ͷ���
public class Text2_Student {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("����ѧ��");
		s.setNo(9527);
		System.out.println(s.getName());
		System.out.println(s.getNo());
		s.study();
		s.review();

		Student s1 = new Student();
		s1.setName("������");
		s1.setNo(250);
		System.out.println(s1.getName());
		System.out.println(s1.getNo());
		s1.study();
		s1.review();
		
	}

}

class Student{
	private String name;
	private int no;
	
	public void setName(String n) {
		name = n ; 
	}
	public String getName() {
		return name;
	}
	public void setNo(int n) {
		no = n ;
	}
	public int getNo() {
		return no;
	}
	
	public void study() {
		System.out.println("�ú�ѧϰ");
	}
	
	public void review() {
		System.out.println("��������");
	}
}




















