package test;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javapro.spring.classes.Dept;

public class TestJson {
	//全局唯一的常量
	private static final ObjectMapper MAPPER = new ObjectMapper();
	
	/*
	 * 1.把java对象转换成
	 */
	@Test
	public void toJson() throws Exception {
		Dept dept = new Dept();
		dept.setId(7);
		dept.setName("詹姆斯邦德");
		System.out.println(dept);
		String Josn = MAPPER.writeValueAsString(dept);
		System.out.println(Josn);
		
	}

	//2.把json字符串转成java对象(反序列化)
	@Test
	public void toJava() throws Exception {
		String json = "{\"id\":7,\"name\":\"詹姆斯邦德\"}";//单个对象	
		Dept dept = MAPPER.readValue(json, Dept.class);
		System.out.println(dept);
		
	}
	
	
	//3.解析京东价格json串,获取某个商品价格
	@Test
	public void getPrice() throws Exception {
		String json = "[{\"cbf\":\"0\",\"id\":\"J_24500013193\",\"m\":\"50000.00\",\"op\":\"21999.00\",\"p\":\"21999.00\"},{\"cbf\":\"0\",\"id\":\"J_24500013193\",\"m\":\"50000.00\",\"op\":\"21999.00\",\"p\":\"99999.00\"}]";
		//json特点:数组.第一条记录,从这个记录中获取key=p,得到21999
		//1.获取数组,返回结果通过对象
		JsonNode node = MAPPER.readTree(json); // 是一个数组
		JsonNode node1 = node.get(1); //数组的第一条记录
		JsonNode price = node1.get("p"); // 某条记录中获取属性为p的值
		String s = price.asText();
		System.out.println(price.asDouble());
		
		
		
	}
	
	
	
	
}




















