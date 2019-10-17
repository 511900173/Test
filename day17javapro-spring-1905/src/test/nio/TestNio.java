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
	@Test // 1.��ͳ��ʽBIO
	public void testBio() throws Exception {
		/*
		 * 1.����������,��ȡ�Ѿ����ڵ��ļ� 
		 * 2.���������,д�ļ� 
		 * 3.���������ж�ȡ��Ϣ,��ȡ��������1024byte 
		 * 4.������� 
		 * 5.�ͷ���Դ
		 */

		// ��¼��ʼ��ʱ��
		long starTime = System.currentTimeMillis();

		String source = "G:/abc/aa.avi"; // ԭ�ļ�
		String target = "F:/bio.rar"; // ����Ŀ���ļ�

		InputStream in = new FileInputStream(source);
		OutputStream os = new FileOutputStream(target);

		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len = in.read(buffer)) > 0) {
			os.write(buffer, 0, len);
		}
		os.close();
		in.close();

		// ��¼����ʱ��
		long endTime = System.currentTimeMillis();
		System.out.println("bioִ��ʱ��:" + (endTime - starTime));
	}

	@Test // 2.�µķ�ʽNIO
	public void testNio() throws Exception {
		/*
		 * 1.��ȡԭ�ļ��ŵ�һ��ͨ���� 2.����һ�����ļ�,�ŵ�����һ��ͨ�� 3.ͨ���и����ļ� 4.д���ļ� 5.�ͷ���Դ
		 */

		long starTime = System.currentTimeMillis();

		String source = "G:/abc/aa.avi"; // ԭ�ļ�
		String target = "F:/nio.rar"; // ����Ŀ���ļ�

		FileChannel sfc = FileChannel.open(Paths.get(source), StandardOpenOption.READ);
		FileChannel tfc = FileChannel.open(Paths.get(target), StandardOpenOption.READ, 
				StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);

		// д�ļ�, ԭfc 0 --- length
		tfc.transferFrom(sfc, 0, sfc.size());

		tfc.close();
		sfc.close();

		long endTime = System.currentTimeMillis();
		System.out.println("nioִ��ʱ��:" + (endTime - starTime));

	}

}
