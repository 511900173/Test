package com.tedu.api;
//测试字符串拼接效率
public class Text2_String {
	public static void main(String[] args) {
		String str = "abcdefghigklmnopqrstuvwxyz";
		String result = "";//创建变量记录拼接的值
		
		//优化了String
		StringBuilder sb = new StringBuilder();
		StringBuffer  sb2 = new StringBuffer();
		
		//拼接100次
		long start = System.currentTimeMillis();//计时开始stuvwxyz
		for (int i = 0; i <= 5000000; i++) {
//			result+=str;
			sb.append(str);
//			sb2.append(str);
		}
		long end = System.currentTimeMillis();//计时结束
		System.out.println(end-start);
		
	}
}
