package com.tedu.linklist02;

import java.util.Iterator;
import java.util.LinkedList;

public class Text3 {

	public static void main(String[] args) {
		/*
		 * <> 泛型限制集合中存放的数据类型 
		 * 泛型和集合，不支持基本类型 
		 * 可以使用包装类型
		 */
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("ttt");
		list.add("jjj");
		list.add("ccc");
		list.add("kkk");
		list.add("aaa");
		list.add("xxx");
		System.out.println(list.size());//数据量
		System.out.println(list);
		System.out.println(list.get(0));//访问第一个值
		System.out.println(list.get(list.size()-1));//尾部值
		System.out.println(list.remove(3));//删除下标3位置
		System.out.println(list);
		System.out.println(list.remove("aaa"));//删除aaa
		System.out.println(list);
		
		//双向链表下标遍历效率低
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//双向链表迭代器遍历效率高
		//新建迭代器实例
		Iterator<String> it = list.iterator();
		//当还有数据
		while (it.hasNext()) {
			String s = it.next();//访问下一项数据
			System.out.println(s);
		}
	
	
	
	}

	
	
	
	
}
