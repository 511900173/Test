package day1203collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Text2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("按回车插入值");
		while (true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(100);
			// 确定插入点
			// 找到，得到r的下标位置，就是插入点
			// 找不到，得到-(插入点+1)
			int index = Collections.binarySearch(list, r);
			if (index >= 0) {
				list.add(index, r);
			} else {
				list.add(-index - 1, r);
			}
			System.out.println(list);

		}

	}

}
