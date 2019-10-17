package day1401文件流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("G:/abc/f1");
		byte[] buff = new byte[5];//盛放数据的数组
		int n;//保存每一批的数量
		//read()方法从文件读取每一批字节，放入指定数组并返回这一批的数量
		while ((n = in.read(buff))!=-1) {
			System.out.println(n+"个:"+Arrays.toString(buff));
			
		}
		in.close();
		
	}
}
