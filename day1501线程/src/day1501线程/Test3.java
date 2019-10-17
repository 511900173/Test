package day1501线程;

public class Test3 {

	public static void main(String[] args) {
		R1 r1 = new R1();
	
		Thread t1 = new Thread(r1);
		//线程启动过后,执行r1.run()
		//r1.add(),r1.add(),r1.add(),r1.add()
		t1.start();
		R1 r2 = new R1();
		//main()线程
		while (true) {
			int i = r2.get();
			if (i%2==1) {
				System.out.println(i);
				System.exit(0);//关闭虚拟机
			}
		}
		

	}
	static class R1 implements Runnable{
		static int i = 0;
		
		static synchronized void add() {
			i++;
			i++;
		}
		
		static synchronized int get() {
			return i;
		}
		
		@Override
		public void run() {
			while (true) {
				add();
			}
		}
	}

}
