package day1201���ӳ���;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("1��è");
		System.out.println("2����");
		System.out.println("ѡ��>>");
		int c = new Scanner(System.in).nextInt();
		System.out.println("������֣�");
		String name = new Scanner(System.in).nextLine();
		System.out.println("�븶�ѣ�");
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
		System.out.println("���س�ִ��");
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
