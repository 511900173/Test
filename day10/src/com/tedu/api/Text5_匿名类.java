package com.tedu.api;

public class Text5_ÄäÃûÀà {
	public static void main(String[] args) {
		new Inter1() {

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println(1);
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println(2);
			}
		}.sleep();
	}
}

interface Inter1 {
	void eat();

	void sleep();
}