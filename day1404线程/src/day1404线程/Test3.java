package day1404线程;

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
					// 格式化工具
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					String s = sdf.format(d);
					System.out.println(s);
					// 1秒
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("谁TMD捅醒了老子");
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
				// 把t线程捅醒,打断t线程的暂停状态
				System.out.println("按回车捅醒t线程");
				new Scanner(System.in).nextLine();
				t.interrupt();
			}
		}.start();

	}























}
