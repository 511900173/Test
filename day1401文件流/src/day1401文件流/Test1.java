package day1401�ļ���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("G:/abc/f1");
		byte[] buff = new byte[5];//ʢ�����ݵ�����
		int n;//����ÿһ��������
		//read()�������ļ���ȡÿһ���ֽڣ�����ָ�����鲢������һ��������
		while ((n = in.read(buff))!=-1) {
			System.out.println(n+"��:"+Arrays.toString(buff));
			
		}
		in.close();
		
	}
}
