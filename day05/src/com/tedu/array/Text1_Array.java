package com.tedu.array;

public class Text1_Array {

	public static void main(String[] args) {
		char[] ch = new char[10];
		ch[0] = 'h';
		ch[1] = 'e';
		ch[2] = 'l';
		ch[3] = 'l';
		ch[4] = 'o';
		char[] c = { 20320, 22909};
//		System.out.println(ch);
//		System.out.println(c);
		//ch.length代表数组的长度
		//ch.length-1 代表下标的最大值
		//ch.length
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	
	}

}
