package com.tedu.api;
//�����ַ���ƴ��Ч��
public class Text2_String {
	public static void main(String[] args) {
		String str = "abcdefghigklmnopqrstuvwxyz";
		String result = "";//����������¼ƴ�ӵ�ֵ
		
		//�Ż���String
		StringBuilder sb = new StringBuilder();
		StringBuffer  sb2 = new StringBuffer();
		
		//ƴ��100��
		long start = System.currentTimeMillis();//��ʱ��ʼstuvwxyz
		for (int i = 0; i <= 5000000; i++) {
//			result+=str;
			sb.append(str);
//			sb2.append(str);
		}
		long end = System.currentTimeMillis();//��ʱ����
		System.out.println(end-start);
		
	}
}
