package javapro.spring;

import javapro.annotation.ComponentScan;
import javapro.spring.classes.Employee;
import javapro.spring.classes.Hello;
import javapro.spring.classes.User;
import javapro.spring.util.ComponentScanParpser;


//����һ��ע��,������ʼ��·��,�Ѿ�
@ComponentScan("javapro.spring.classes")
public class RunApp {
	//ִ�г���
	public static void main(String[] args) throws Exception {
		//��ȡ���ϵ�ע��,��ȡvalue,����
		RunApp run = new RunApp();
		Class<?> clazz = run.getClass();
		
		//��ȡ��ǰ�����ڵ�·��
		String dir = clazz.getResource("/").getPath();
		System.out.println(dir);
		
		ComponentScan cs = clazz.getDeclaredAnnotation(ComponentScan.class);
		if (null != cs) {
		String value = cs.value();	
		System.out.println("��ɨ��·��"+value);
//		dir+=value.replaceAll("\\.", "/");
		System.out.println("��ɨ��ľ���·��:"+dir);
		
		//
		
		
		//��ע���л�ȡ���·��
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
