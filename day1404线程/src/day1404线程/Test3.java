package day1404�߳�;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Thread t = new Thread() {

			@Override
			public void run() {
				while (true) {
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
		new Thread() {
			@Override
			public void run() {
				// ��t�߳�ͱ��,���t�̵߳���ͣ״̬
				System.out.println("���س�ͱ��t�߳�");
				new Scanner(System.in).nextLine();
				t.interrupt();
			}
		}.start();

	}























}
