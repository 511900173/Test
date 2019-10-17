package com.tedu.arrayslist04;

import java.util.ArrayList;
import java.util.Iterator;

public class Text1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(111);
		list.add(666);
		list.add(333);
		list.add(777);
		list.add(111);
		list.add(111);
		list.add(999);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(3));
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.remove(Integer.valueOf(111)));
		System.out.println(list);

		//
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer a =it.next();
			System.out.println(a);
		}
		
	}

}
