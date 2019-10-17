package javase.util;

import java.io.File;

import org.junit.Test;

//遍历目录,打印所有的文件
public class RecesionDir {
	/*
	 * 开发步骤: 1.给定一个固定的目录,然后利用文件对象提供api转换 
	 * 2.判断是否为空目录,如果有文件则遍历 
	 * 3.判断是文件还是目录,如果是文件直接输出
	 * 4.如果判读是目录,调用自身,(参数路径,当前目录),必须有出口 
	 * 5.遍历完成
	 */

	@Test
	public void testRecursion() {
		String dir = "E:\\eclipse-workspace\\day16 javase\\bin\\";
		this.readClassName(dir);
	}

	// 工具类:遍历指定目录下的所有子目录及文件
	public void readClassName(String dir) {
		File file = new File(dir);// 创建文件对象(目录)
		File[] files = file.listFiles();// 获取当前目录下的所有子目录及文件.特点,不会获取子目录的内容
		if (null == files || files.length == 0) {// 判断当前目录下面有没有内容
			System.out.println("此目录为空");
		} else {// 当前目录下有内容
			for (File f : files) {// 遍历当前目录下的内容
				if (f.isDirectory()) {// 子目录
					System.out.println("遍历子目录:" + f.getAbsolutePath());
					readClassName(f.getAbsolutePath());// 递归,调用自身,参数值要变化
				} else {// 文件
					System.out.println(f.getAbsolutePath());
					FileUtil fu = new FileUtil();
					String s = fu.getClassName(f.getAbsolutePath());
					System.out.println(s);
					String beanname = fu.getBeanName(s);
					System.out.println(beanname);
					String c = fu.toFirstLower(beanname);
					System.out.println(c);
				}
			}
		}

	}

}
