package javase.spring.pojo;

import javase.spring.annotation.Controller;
import javase.spring.annotation.Service;

@Controller("66666")
@Service("55555")
public class Hello {
	private String name = "tony";
	public void name() {
		System.out.println(this.name);
	}
}
