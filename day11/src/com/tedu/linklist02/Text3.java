package com.tedu.linklist02;

import java.util.Iterator;
import java.util.LinkedList;

public class Text3 {

	public static void main(String[] args) {
		/*
		 * <> �������Ƽ����д�ŵ��������� 
		 * ���ͺͼ��ϣ���֧�ֻ������� 
		 * ����ʹ�ð�װ����
		 */
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("ttt");
		list.add("jjj");
		list.add("ccc");
		list.add("kkk");
		list.add("aaa");
		list.add("xxx");
		System.out.println(list.size());//������
		System.out.println(list);
		System.out.println(list.get(0));//���ʵ�һ��ֵ
		System.out.println(list.get(list.size()-1));//β��ֵ
		System.out.println(list.remove(3));//ɾ���±�3λ��
		System.out.println(list);
		System.out.println(list.remove("aaa"));//ɾ��aaa
		System.out.println(list);
		
		//˫�������±����Ч�ʵ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//˫���������������Ч�ʸ�
		//�½�������ʵ��
		Iterator<String> it = list.iterator();
		//����������
		while (it.hasNext()) {
			String s = it.next();//������һ������
			System.out.println(s);
		}
	
	
	
	}

	
	
	
	
}
