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
		 * 开发步骤
		 * 1.创建socket对象,传输时二进制流
		 * 2.访问百度,参数:www.baidu.com(ip),  端口port,默认80
		 *   65536,tomcat 8080, MySQL 3306 
		 * 3.构建一个输出流,buffer缓存
		 * 4.写东西HTTP请求规范,相当于浏览器发起请求
		 * 5.构建一个输入流,buffer缓存
		 * 6.从输入流中获取信息,展现,打印到控制台
		 */
		
		String hostname = "www.baidu.com";
		//创建套接字,封装网络对象
		Socket s = new Socket(hostname, 80);
		
		//从套接字中获取输出流
		OutputStream os = s.getOutputStream();
		//创建一个输出流的缓存,批量执行,性能高
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		
		//发起HTTP请求,按HTTP协议写
		bw.write("GET / HTTP/1.1\r\n");
		bw.write("Host:"+hostname+"\r\n");
		bw.write("Connetion: Keep-Alive\r\n\r\n");
		//批量提交
		bw.flush();// 把缓存中的数据全部提交/批量提交
		
		//接收
		//创建输入流
		InputStream is = s.getInputStream();
		//为了提高处理能力,批量,缓存buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		//从输入流中读取数据,网站返回的数据
		String str = null;
		str = br.readLine();
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
		//关闭
		s.close();
		System.out.println("完毕");
		
	}
	
	
}











