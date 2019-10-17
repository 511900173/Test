package day1403编码转换流;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test2 {

	public static void main(String[] args) throws Exception {
		/*
		 * unicode编码表,中文编码范围
		 *\u4e00到\u9fa5
		 *共20902个中文字符
		 */
		f("GBK","g:/abc/f5");
		f("UTF-8","g:/abc/f6");
	}

	private static void f(String charset, String path) throws Exception {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path),charset);
		int count=0;
		for (char i = '\u4e00'; i < '\u9fa5'; i++) {
			out.write(i);
			count++;
			if (count == 30) {
				out.write('\n');
				count=0;
			}
		}
		out.close();
		
	}

}
