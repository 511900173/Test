package day1201电子宠物;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("1、猫");
		System.out.println("2、狗");
		System.out.println("选择>>");
		int c = new Scanner(System.in).nextInt();
		System.out.println("起个名字：");
		String name = new Scanner(System.in).nextLine();
		System.out.println("请付费：");
		int m = new Scanner(System.in).nextInt();
		
		Pet pet;
		if (c==1) {
			if (m==0) {
				pet = new Cat(name);
			}else {
				pet = new Cat(name,100,100);
			}
		}else {
			if (m==0) {
				pet = new Dog(name);
			}else {
				pet = new Dog(name,100,100);
			}
		}
		f(pet);
	}

	private static void f(Pet pet) {
		System.out.println("按回车执行");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch (r) {
			case 0: pet.feed();break;
			case 1: pet.play();break;
			default:pet.punish();break;
			}
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
