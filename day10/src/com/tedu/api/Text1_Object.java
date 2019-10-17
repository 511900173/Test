package com.tedu.api;

//����Object���toString() equals()
public class Text1_Object {
	public static void main(String[] args) {
		Student s = new Student();
		s.setAge(18);
		s.setName("����");
		s.setId(10086);
		// ����Student������д��toString()
		// �����������ʱ�����ǵ�ֵַ��������ֵ
		System.out.println(s);

		Student s1 = new Student();
		s1.setAge(18);
		s1.setName("����");
		s1.setId(10086);

		System.out.println(s == s1);
		System.out.println(s.equals(s1));

	}

}

class Student {
	private int id;
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// ��дObject�ṩ��toString()
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	// ��дequals()
	// Ĭ���ṩ���ǱȽ϶���ĵ�ֵַ
	// ������������ֵ��ȫ��ͬ��ô�϶���һ������
	@Override
	public boolean equals(Object obj) {
		// �ж��������������ֵ�����ͬ����true
		// ��Objectǿת��Student����
		Student s = (Student) obj;

		// ��s�����Ժ�this�����Ա�
		return s.id == this.id && s.name == this.name && s.age == this.age;
	}

}