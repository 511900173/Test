package javase.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class TestSocket {
	public static void main(String[] args) throws Exception {
		/*
		 * ��������
		 * 1.����socket����,����ʱ��������
		 * 2.���ʰٶ�,����:www.baidu.com(ip),  �˿�port,Ĭ��80
		 *   65536,tomcat 8080, MySQL 3306 
		 * 3.����һ�������,buffer����
		 * 4.д����HTTP����淶,�൱���������������
		 * 5.����һ��������,buffer����
		 * 6.���������л�ȡ��Ϣ,չ��,��ӡ������̨
		 */
		
		String hostname = "www.baidu.com";
		//�����׽���,��װ�������
		Socket s = new Socket(hostname, 80);
		
		//���׽����л�ȡ�����
		OutputStream os = s.getOutputStream();
		//����һ��������Ļ���,����ִ��,���ܸ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		
		//����HTTP����,��HTTPЭ��д
		bw.write("GET / HTTP/1.1\r\n");
		bw.write("Host:"+hostname+"\r\n");
		bw.write("Connetion: Keep-Alive\r\n\r\n");
		//�����ύ
		bw.flush();// �ѻ����е�����ȫ���ύ/�����ύ
		
		//����
		//����������
		InputStream is = s.getInputStream();
		//Ϊ����ߴ�������,����,����buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		//���������ж�ȡ����,��վ���ص�����
		String str = null;
		str = br.readLine();
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
		//�ر�
		s.close();
		System.out.println("���");
		
	}
	
	
}











