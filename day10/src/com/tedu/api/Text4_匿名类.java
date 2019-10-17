package com.tedu.api;

public class Text4_ÄäÃûÀà {
	public static void main(String[] args) {
		//new Zoo().eat();
		new Zoo() {
			public void sleep() {
				System.out.println(2);
			}
		}.sleep();
				
	}
}

class Zoo {
	int sum = 10;

	public void eat() {
		System.out.println(1);
	}
}