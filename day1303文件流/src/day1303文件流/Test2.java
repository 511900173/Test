package day1303�ļ���;

import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f1
		 */
		FileInputStream in = new FileInputStream("G:/abc/f1");
		int b;//����ÿ�ζ�ȡ���ֽ�ֵ
		//���ļ���ȡһ���ֽڣ����浽����b
		//���жϱ���b��ֵ�Ƿ���-1
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
