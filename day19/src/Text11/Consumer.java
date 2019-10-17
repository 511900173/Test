package Text11;



public class Consumer extends Thread {
	private Stack stack;

	public Consumer(Stack stack) {
		this.stack = stack;
	}
	@Override
	public void run() {
		while (true) {
			
			synchronized (stack) {
				char c = stack.pop();
				System.out.println("µ¯³ö>>" + c);
			}
		}

	}
}
