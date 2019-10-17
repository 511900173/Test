package test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class TestPRroperties {
	@Test
	public void prop() throws Exception {
		/*
		 * 1.定位这个文件
		 * 2.创建一个文件流 FileInputStream
		 * 3.Properties prop创建属性文件对象
		 * 4.prop.load(is) 读取
		 * 5.打印prop展现所有内容
		 */
		
		//  /代表从.../bin/开始
		String dir = this.getClass().getResource("/").getPath();
		String filename = dir + "resources/jbdc.properties";
		InputStream is = new FileInputStream(filename);
		Properties prop = new Properties();
		prop.load(is); // 属性文件一般很小,所以所有内容都在内存中
		is.close();
		System.out.println(prop);
		
		//读取摸个特定值
		String username = prop.getProperty("jdbc.username");
		System.out.println(username);
	}
}













