package com.tedu.guess01猜数字;

import java.util.Scanner;
public abstract class GuessGame {
	//启动游戏的方法，包含两种游戏的通用流程
	public void start() {
		//产生随机值,不同代码就调方法
		String r = suiji();
		//提示
		tishi();
		//循环猜
		while(true) {
			System.out.println("猜：");
			String c = new Scanner(System.in).nextLine();
			//比对猜的值c和随机值r，并得到比较结果
			String result = biDui(c,r);
			System.out.println(result);
			//判断result是否猜对的结果
			if (caiDui(result)) {
				break;
			}	
		}
	}
	/*
	 * 抽象方法的作用：
	 * --作为通用的方法在父类中定义
	 * --要求子类必须实现该方法
	 */
	public abstract String suiji();
	public abstract void tishi();
	public abstract String biDui(String c, String r);
	public abstract boolean caiDui(String result);
}
