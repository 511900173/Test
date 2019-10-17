package Text11;

public class Stack {
	private char[] a = new char[5];
	private int index;
	public void push(char c) {
		if (isFull()) {
			return ;
		}
		a[index] = c;
		index ++;
	}
	public char pop() {
		if (isEmpty()) {
			return ' ';
		}
		index--;
		char c  = a[index];
		return c;
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return index==0;
	}
	private boolean isFull() {
		return index==5;
	}
}
