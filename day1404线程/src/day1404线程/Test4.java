package day1404线程;

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
		Thread t2 = new Thread() {
			@Override
			public void run() {
				// 把t线程捅醒,打断t线程的暂停状态
				System.out.println("按回车捅醒t线程");
				new Scanner(System.in).nextLine();
				t.interrupt();
			}
		};
		
		//设置成后台进程
		//虚拟机推出时,不等待后台线程结束
		t2.setDaemon(true);
		t2.start();

	}

}
