package com.tedu.guess01������;

import java.util.Scanner;
public abstract class GuessGame {
	//������Ϸ�ķ���������������Ϸ��ͨ������
	public void start() {
		//�������ֵ,��ͬ����͵�����
		String r = suiji();
		//��ʾ
		tishi();
		//ѭ����
		while(true) {
			System.out.println("�£�");
			String c = new Scanner(System.in).nextLine();
			//�ȶԲµ�ֵc�����ֵr�����õ��ȽϽ��
			String result = biDui(c,r);
			System.out.println(result);
			//�ж�result�Ƿ�¶ԵĽ��
			if (caiDui(result)) {
				break;
			}	
		}
	}
	/*
	 * ���󷽷������ã�
	 * --��Ϊͨ�õķ����ڸ����ж���
	 * --Ҫ���������ʵ�ָ÷���
	 */
	public abstract String suiji();
	public abstract void tishi();
	public abstract String biDui(String c, String r);
	public abstract boolean caiDui(String result);
}
