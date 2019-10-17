package day1303文件流;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f1
		 */
		FileInputStream in = new FileInputStream("G:/abc/f1");
		int b;//保存每次读取的字节值
		//从文件读取一个字节，保存到变量b
		//在判断变量b的值是否是-1
		while ((b=in.read())!=-1) {
			System.out.println(b);
		}
		
		in.close();

		
//		while (true) {
//			b = in.read();
//			if (b==-1) {
//				break;
//			}
//			System.out.println(b);
//		}
		
		
		
	}
}
