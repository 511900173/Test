package day1203collections������;

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
		Collections.sort(list);// ���ַ������ַ�����
		Collections.sort(list2);// ���ַ������ַ�����
		System.out.println(list);
		System.out.println(list2);

		Comparator<String> comp = new Comparator<String>() {
			/*
			 * o1��o2�Ƚϴ�С o1�󣬷������� o1С�����ظ��� ��ͬ������0
			 * 
			 */
			@Override
			public int compare(String o1, String o2) {
				int a = Integer.parseInt(o1);
				int b = Integer.parseInt(o2);
				return a - b;
			}
		};
		// sort()��������У�ʹ��comp

		Collections.sort(list, comp);
		System.out.println(list);

		// foreach ������ʽ
		for (String s : list) {
			System.out.println(s + "-");
		}
		// ������������ʽ
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}

	}

}
