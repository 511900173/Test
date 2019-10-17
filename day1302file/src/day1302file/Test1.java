package day1302file;

import java.io.File;

public class Test1 {
	public static void main(String[] args) {
		String path;
		path = "E:/eclipse/eclipse.exe";//存在的文件
//.
		path = "E:/eclipse/p2";//存在的文件
//		path = "H:/eclipse/p2";//存在的文件夹
		File f = new File(path);//路径字符串封装到File的实例
		
		System.out.println(f.getName());//文件名
		System.out.println(f.getParent());//父目录
		System.out.println(f.getAbsolutePath());//完整路径
		System.out.println(f.length());//字节量，文件夹无效
		System.out.println(f.exists());//是否存在
		System.out.println(f.isFile());//是否是文件
		System.out.println(f.isDirectory());//是否是文件夹
		
	}
}
