package com.tedu.fors;

//����forѭ��
public class Text7_For {

	public static void main(String[] args) {
		method1();// ��ӡ1-10

	}

	// ����method1����
	public static void method1() {
		// for(��ʼ����;ѭ������;��������;){ѭ����;}
		
		for (int i = 0; i <= 1000000; i++) {
			// i ����ǰȡ����ֵ 
			int a = (int) (Math.random()*100000);
				System.out.print(a);
			}
				System.out.println();
		
	}

}
