package day1403����ת����;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
	public static void main(String[] args) throws Exception {
		f("abc����", "GBK", "g:/abc/f3");
		f("abc����", "UTF-8", "g:/abc/f4");

	}

	/*
	 * �ַ����� encoding �ַ��� charset
	 */
	private static void f(String s, String charset, String path) throws Exception {

		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(path), charset);
		out.write(s);
		out.close();

	}
}
