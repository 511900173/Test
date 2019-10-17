package javapro.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})//这个注解只能用于属性上
@Retention(RetentionPolicy.RUNTIME)
public @interface Autowried {
	String value() default "";
}
