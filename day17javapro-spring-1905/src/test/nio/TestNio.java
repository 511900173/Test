package test.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.junit.Test;

public class TestNio {
	@Test // 1.传统方式BIO
	public void testBio() throws Exception {
		/*
		 * 1.创建输入流,读取已经存在的文件 
		 * 2.创建输出流,写文件 
		 * 3.从输入流中读取信息,读取到缓存中1024byte 
		 * 4.输出内容 
		 * 5.释放资源
		 */

		// 记录开始的时间
		long starTime = System.currentTimeMillis();

		String source = "G:/abc/aa.avi"; // 原文件
		String target = "F:/bio.rar"; // 复制目标文件

		InputStream in = new FileInputStream(source);
		OutputStream os = new FileOutputStream(target);

		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = in.read(buffer)) > 0) {
			os.write(buffer, 0, len);
		}
		os.close();
		in.close();

		// 记录结束时间
		long endTime = System.currentTimeMillis();
		System.out.println("bio执行时间:" + (endTime - starTime));
	}

	@Test // 2.新的方式NIO
	public void testNio() throws Exception {
		/*
		 * 1.读取原文件放到一个通道中 2.创建一个新文件,放到另外一个通道 3.通道中复制文件 4.写新文件 5.释放资源
		 */

		long starTime = System.currentTimeMillis();

		String source = "G:/abc/aa.avi"; // 原文件
		String target = "F:/nio.rar"; // 复制目标文件

		FileChannel sfc = FileChannel.open(Paths.get(source), StandardOpenOption.READ);
		FileChannel tfc = FileChannel.open(Paths.get(target), StandardOpenOption.READ, 
				StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);

		// 写文件, 原fc 0 --- length
		tfc.transferFrom(sfc, 0, sfc.size());

		tfc.close();
		sfc.close();

		long endTime = System.currentTimeMillis();
		System.out.println("nio执行时间:" + (endTime - starTime));

	}

}
