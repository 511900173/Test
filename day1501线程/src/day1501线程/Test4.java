package day1501Ïß³Ì;

public class Test4 {

	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		p.start();
		c.start();
		
		while (true) {
			synchronized (stack) {
				stack.notifyAll();
			}
		}
		
		
	}

}
