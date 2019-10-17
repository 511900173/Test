package test;

import java.lang.annotation.Annotation;

import org.junit.Test;

import javase.spring.annotation.Controller;
import javase.spring.annotation.Service;

public class TestRelect {
	@Test
	public void getCotrollerAnnotation() throws Exception {
		Class<?> clazz = Class.forName("javase.spring.pojo.Hello");
		Annotation[] as = clazz.getDeclaredAnnotations();
		for (Annotation a : as) {
			System.out.println(a.toString());
		}
		Controller c = clazz.getAnnotation(Controller.class);
		System.out.println(c);
		Service s = clazz.getAnnotation(Service.class);
		System.out.println(s);
	}
}
