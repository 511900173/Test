package com.tedu.yuansuan;

import java.util.Scanner;

//����ƽ������
public class Test1_Year {

	public static void main(String[] args) {
		// ��ʾ�û���������
		System.out.println("��������ݣ�");
		// �����û���������
		@SuppressWarnings("resource")
		int year = new Scanner(System.in).nextInt();
		String desc = "ƽ��";// ����Ĭ�Ͼ���ƽ��
		// if(�ж�����){���������Ĵ���}
		// �ж��ǲ�������
		// ���Ա�4���� ���Ҳ��ܱ�100���� ���߿��Ա�400����
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			// ����Ϊ����
			desc = "����";
		}

		System.out.println("" + year + "����" + desc + "");
	}

}
