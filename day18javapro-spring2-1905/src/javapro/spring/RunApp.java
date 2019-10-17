package javapro.spring;

import javapro.annotation.ComponentScan;
import javapro.spring.classes.Person;
import javapro.spring.classes.User;
import javapro.spring.util.ComponentScanParpser;

@ComponentScan("javapro.spring.classes")
public class RunApp {
	public static void main(String[] args) throws Exception {
		
		RunApp run = new RunApp();
		Class<?> clazz = run.getClass();
		
		//获取当前类所在的路径
		String dir = clazz.getResource("/").getPath();
		System.out.println(dir);
		
		ComponentScan cs = clazz.getDeclaredAnnotation(ComponentScan.class);
		if (null != cs) {
			dir+=cs.value().replaceAll("\\.", "/");
			System.out.println(dir);
		}
		
		ComponentScanParpser csp = new ComponentScanParpser();
		csp.config(dir);
		
		
		User u= (User) csp.getBean("user");
		System.out.println(u);
		
		Person p = (Person) csp.getBean("person");
		System.out.println(p);
		
	}
}
