package day1403编码转换流;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		f("abc中文", "GBK", "g:/abc/f3");
		f("abc中文", "UTF-8", "g:/abc/f4");

	}

	/*
	 * 字符编码 encoding 字符集 charset
	 */
	private static void f(String s, String charset, String path) throws Exception {

		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), charset);
		out.write(s);
		out.close();

	}
}
