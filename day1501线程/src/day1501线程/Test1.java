package day1501线程;

public class Test1 {

	public static void main(String[] args) throws Exception {
		// 求10000000万内质数的数量
		System.out.println("---单线程--------");
		f1();
		System.out.println("---五线程--------");
		f2();

	}

	private static void f1() throws Exception {
		long t = System.currentTimeMillis();
		//
		T1 t1 = new T1(0, 10000000);
		t1.start();

		// main线程暂停,等待t1线程接受后,再去结果
		t1.join();

		int c = t1.count;

		t = System.currentTimeMillis() - t;
		System.out.println("时间" + t);
		System.out.println("质数数量" + c);
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
		System.out.println("时间" + t);
		System.out.println("质数数量" + sum);
	}

	static class T1 extends Thread {

		int start;
		int end;
		int count;

		public T1(int start, int end) {
			if (start < 3) {
				start = 3;
				count = 1;// 已知有一个质数
			}
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {
			// i循环从start到<end
			for (int i = start; i < end; i++) {
				// 判断i是否是质数
				if (isPrime(i)) {
					count++;
				}
			}

		}

		private boolean isPrime(int i) {
			// 判断i的值是否是质数
			// j循环从2到i开方+1,找到能把i整除的值
			double d = 1 + Math.sqrt(i);
			for (int j = 2; j < d; j++) {

				if (i % j == 0) {
					return false;
				}
			}
			// 所有值都判断完,没有找到能把i整除的值
			// i是质数
			return true;
		}
	}

}
