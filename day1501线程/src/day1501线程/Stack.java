package day1501�߳�;

public class Stack {
	private char[] a = new char[5];
	private int index;

	public void push(char c) {
		if (isFull()) { // ����,������ѹ����
			return;
		}
		a[index] = c;
		index++;
	}

	public char pop() {
		if (isEmpty()) { //����,�����ڵ���
			return ' '; // �ÿո��ʾû������
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
