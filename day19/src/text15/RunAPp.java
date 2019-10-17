package text15;

import java.util.Random;
import java.util.Scanner;

public class RunAPp {

	public static void main(String[] args) {
		System.out.println("1.狗");
		System.out.println("2.猫");
		System.out.println("请选择>>");
		int c = new Scanner(System.in).nextInt();
		System.out.println("起个名字:");
		String name = new Scanner(System.in).nextLine();

		Pet pet = null;

		if (c == 1) {
			pet = new Dog(name);
		} else if (c == 2) {
			pet = new Cat(name);
		} else {
			System.out.println("选择错误");
		}
	

	f(pet);

}

	private static void f(Pet pet) {
		System.out.println("按回车执行");

		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3)+1;
			switch (r) {
			case 1:
				pet.eat();
				break;
			case 2:
				pet.play();
				break;
			default:
				pet.da();
			}

		}

	}
}