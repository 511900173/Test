package day1501�߳�;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// ��10000000��������������
		System.out.println("---���߳�--------");
		f1();
		System.out.println("---���߳�--------");
		f2();

	}

	private static void f1() throws Exception {
		long t = System.currentTimeMillis();
		//
		T1 t1 = new T1(0, 10000000);
		t1.start();

		// main�߳���ͣ,�ȴ�t1�߳̽��ܺ�,��ȥ���
		t1.join();

		int c = t1.count;

		t = System.currentTimeMillis() - t;
		System.out.println("ʱ��" + t);
		System.out.println("��������" + c);
	}

	private static void f2() throws Exception {
		long t = System.currentTimeMillis();
		//
		T1[] a = new T1[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = new T1(i * 2000000, (i + 1) * 2000000);
			a[i].start();
		}
		//
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			a[i].join();
			sum += a[i].count;
		}
		t = System.currentTimeMillis() - t;
		System.out.println("ʱ��" + t);
		System.out.println("��������" + sum);
	}

	static class T1 extends Thread {

		int start;
		int end;
		int count;

		public T1(int start, int end) {
			if (start < 3) {
				start = 3;
				count = 1;// ��֪��һ������
			}
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			// iѭ����start��<end
			for (int i = start; i < end; i++) {
				// �ж�i�Ƿ�������
				if (isPrime(i)) {
					count++;
				}
			}

		}

		private boolean isPrime(int i) {
			// �ж�i��ֵ�Ƿ�������
			// jѭ����2��i����+1,�ҵ��ܰ�i������ֵ
			double d = 1 + Math.sqrt(i);
			for (int j = 2; j < d; j++) {

				if (i % j == 0) {
					return false;
				}
			}
			// ����ֵ���ж���,û���ҵ��ܰ�i������ֵ
			// i������
			return true;
		}
	}

}
