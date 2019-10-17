package test;

import java.lang.annotation.Annotation;

import org.junit.Test;

import javase.spring.annotation.Controller;
import javase.spring.annotation.Service;

public class TestRelect {
	//获取类上的注解
	//异常
	@Test
	public void testControllerAnnotation() throws Exception {
		//获取hello.class上的所有注解
		//<泛型>标识这个类中的元素类型,?通配符
		Class<?> clazz = Class.forName("javase.spring.pojo.Hello");
		
		//反射提供获取类上的所有注解
		Annotation[] as = clazz.getDeclaredAnnotations();
		//遍历
		for (Annotation a : as) {
			System.out.println(a.toString());
		}
		
		//获取@Controller注解
		Controller c = clazz.getAnnotation(Controller.class);
		System.out.println(c.value());
		
		Service s = clazz.getAnnotation(Service.class);
		System.out.println(s.value());
	}
}




















