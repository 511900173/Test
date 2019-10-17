package javase.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//标识他工作在类的头上,还是方法的头上...
@Target({ElementType.TYPE})	// @Target目标,{}数组,枚举类型
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	//private String value
	String value() default "";	//有一个values属性,字符串类型,默认值空
}

