package day1303�ļ���;

import java.io.FileOutputStream;

public class Test1 {
	public static void main(String[] args) throws Exception{
		/*
		 * d:/abc/f1
		 * FOS--f1
		 */
		//�ļ����������f1�ļ���
		FileOutputStream out = new FileOutputStream("G:/abc/f1");
		out.write(97);// 00 00 00 61 -->61
		out.write(98);// 00 00 00 62 -->62
		out.write(99);// 00 00 00 63 -->63
		out.write(356);// 00 00 00 64 -->64  -356
		
		byte[] a = {
				101,102,103,104,105,106,107,108,109,110
		};
		out.write(a,0,10);//��0��ʼ��10��
		out.write(a,3,4);//3��ʼ��4��
		out.close();//�ͷ�ϵͳ��Դ
		
	}		
		
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}