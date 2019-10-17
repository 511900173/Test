package day1501�߳�;

import java.util.Random;

public class Producer extends Thread {
	private Stack stack;

	public Producer(Stack stack) {
		this.stack = stack;
	}

	@Override
	public void run() {
		while (true) {
			// a��z
			char c = (char) ('a' + new Random().nextInt(26));
			synchronized (stack) {
				if (stack.isFull()) {
					try {
						stack.wait();
					} catch (InterruptedException e) {
					}
				}
				stack.push(c);
				System.out.println("ѹ��<<" + c);
				stack.notifyAll();
			}
		}
	}
}
