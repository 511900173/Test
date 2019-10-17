package day1501线程;

public class Consumer extends Thread {
	private Stack stack;

	public Consumer(Stack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (stack) {
				while (stack.isEmpty()) {
					// 当前线程,在stack实例上等待
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				char c = stack.pop();
				System.out.println("弹出>>" + c);
				stack.notifyAll();
			}
		}
	}
}
