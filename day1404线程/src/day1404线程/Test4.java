package day1404�߳�;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Thread t = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {

					Date d = new Date();
					// ��ʽ������
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					String s = sdf.format(d);
					System.out.println(s);
					// 1��
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("˭TMDͱ��������");
						break;
					}
				}

			}
		};
		t.start();

		//
		Thread t2 = new Thread() {
			@Override
			public void run() {
				// ��t�߳�ͱ��,���t�̵߳���ͣ״̬
				System.out.println("���س�ͱ��t�߳�");
				new Scanner(System.in).nextLine();
				t.interrupt();
			}
		};
		
		//���óɺ�̨����
		//������Ƴ�ʱ,���ȴ���̨�߳̽���
		t2.setDaemon(true);
		t2.start();

	}

}
