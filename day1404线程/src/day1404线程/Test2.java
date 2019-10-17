package day1404线程;

public class Test2 {

	public static void main(String[] args) {
		R1 r1 = new R1();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);
		t1.start();
		t2.start();
	}

	
	
	static class R1 implements Runnable{

		@Override
		public void run() {
			//获得正在执行这行代码的线程(当前线程)
			Thread t = Thread.currentThread();
			//获得线程名
			String n = t.getName();
			for (int i = 1; i<10; i++) {
				System.out.println(n+"-"+i);
			}
			
			
		}
		
	}
}
