package day1203collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Text1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		Collections.addAll(list, "1", "22", "20", "30", "11", "31", "3", "10", "2", "21", "12");
		Collections.addAll(list2, "A", "B", "D", "E", "H", "K", "Y", "X", "Y", "U", "O");
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list);// 对字符串按字符排序
		Collections.sort(list2);// 对字符串按字符排序
		System.out.println(list);
		System.out.println(list2);

		Comparator<String> comp = new Comparator<String>() {
			/*
			 * o1和o2比较大小 o1大，返回正数 o1小，返回负数 相同，返回0
			 * 
			 */
			@Override
			public int compare(String o1, String o2) {
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				return a - b;
			}
		};
		// sort()运算过程中，使用comp

		Collections.sort(list, comp);
		System.out.println(list);

		// foreach 遍历格式
		for (String s : list) {
			System.out.println(s + "-");
		}
		// 迭代器遍历格式
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}

	}

}
