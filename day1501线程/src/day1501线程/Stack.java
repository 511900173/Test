package day1501线程;

public class Stack {
	private char[] a = new char[5];
	private int index;

	public void push(char c) {
		if (isFull()) { // 满了,不能再压入了
			return;
		}
		a[index] = c;
		index++;
	}

	public char pop() {
		if (isEmpty()) { //空了,不能在弹出
			return ' '; // 用空格表示没有数据
		}
		index --;
		char c = a[index];
		return c;
	}

	public boolean isFull() {
		return index == 5;
	}

	public boolean isEmpty() {
		return index == 0;
	}

}
