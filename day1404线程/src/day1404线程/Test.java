package day1404�߳�;

public class Test {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		//�߳�������,�Զ�ִ��run()����
		t1.start();
		t2.start();
		System.out.println("main");
	}

	static class T1 extends Thread {


		@Override
		public void run() {
			// ����߳���
			String n = getName();
			// 1-1000
			for (int i = 1;i<=10 ; i++) {
				System.out.println(n+"-"+i);
			}

		}

	}
}
