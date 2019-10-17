package javase.spring.pojo;

import javase.spring.annotation.Controller;
import javase.spring.annotation.Service;

@Controller
@Service
public class Hello {
	private String name ="tony" ;
	public void hi() {
		
		System.out.println(this.name);
	}
}
