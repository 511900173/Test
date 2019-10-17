package test;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class TestJsoup {
	@Test //抓取价格,ajax二次抓取 price J-p-24500013193
	public void getPrice() throws Exception {
		String url = "https://p.3.cn/prices/mgets?skuIds=J_24500013193";
		//直接获取链接中的内容
		String s = Jsoup.connect(url).ignoreContentType(true).execute().body();
		System.out.println(s);
		
	}
	
	@Test //抓取页面信息
	public void getINfo() throws Exception {
		//要访问的页面
		String url = "https://item.jd.com/24500013193.html";
		
		//1.创建链接,相当于socket
		Connection cn = Jsoup.connect(url);
		
		//2.获取整个页面
		Document doc = cn.get();
		//<p class="bjh-p">..</p> 规则:在class=""属性前面加点
		Elements els = doc.select(".price J-p-24500013193");//从整个页面中挑出标签,获取内容
		for (Element e : els) {
			String info = e.text();
			System.out.println(info);
			
		}			
	}
}
