package com.tedu.method;

//���Է���
public class Text4_Method {

	public static void main(String[] args) {
		System.out.println(1);
		// ����ָ������
		// method1();
		// method2(10d);//�����Ĳ���
		int result = method3(100);// �з���ֵ�ķ���
		System.out.println(result);
		String desc = method4("�Ұ�ѧϰ");
		System.out.println(desc);

		System.out.println(2);

	}

	// ���������� ��������������ǲ���ִ�е�
	public static void method1() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
	}

	// ��������2,���ҰѲ������ݸ�a
	// �ڴ�������ʱ��Ҫָ���������ͺͲ�����
	public static void method2(double a) {
		System.out.println(a * a);

	}

	// ����method3
	public static int method3(int num) {
		num = num * num * num ;
		// ͨ��return �ؼ��֣��ѽ�����ظ�����λ�ñ���
		return num;
	}

	public static String method4(String qqq) {
		qqq = "����";
		return qqq;

	}

}
