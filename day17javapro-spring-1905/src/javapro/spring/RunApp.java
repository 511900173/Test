package javapro.spring;

import javapro.annotation.ComponentScan;
import javapro.spring.classes.Employee;
import javapro.spring.classes.Hello;
import javapro.spring.classes.User;
import javapro.spring.util.ComponentScanParpser;


//增加一个注解,设置起始包路径,已经
@ComponentScan("javapro.spring.classes")
public class RunApp {
	//执行程序
	public static void main(String[] args) throws Exception {
		//获取类上的注解,获取value,反射
		RunApp run = new RunApp();
		Class<?> clazz = run.getClass();
		
		//获取当前类所在的路径
		String dir = clazz.getResource("/").getPath();
		System.out.println(dir);
		
		ComponentScan cs = clazz.getDeclaredAnnotation(ComponentScan.class);
		if (null != cs) {
		String value = cs.value();	
		System.out.println("包扫描路径"+value);
//		dir+=value.replaceAll("\\.", "/");
		System.out.println("包扫描的绝对路径:"+dir);
		
		//
		
		
		//从注解中获取这个路径
		String  packagePath = dir+value.replaceAll("\\.", "/"); 
		ComponentScanParpser csp = new ComponentScanParpser();
		csp.config(packagePath);
		
		//
		csp.inject();
		
		//
		Hello h = (Hello) csp.getBean("hello");
		h.hi();
		System.out.println(h);
		
		//
		Employee emp = (Employee) csp.getBean("employee");
		System.out.println(emp);
		
		
		//
		User user = (User) csp.getBean("user");
		System.out.println(user);
		
		
		
		}
	}

}
