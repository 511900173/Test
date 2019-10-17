package javase.spring.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//��ʶ�����������ͷ��,���Ƿ�����ͷ��...
@Target({ElementType.TYPE})	// @TargetĿ��,{}����,ö������
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	//private String value
	String value() default "";	//��һ��values����,�ַ�������,Ĭ��ֵ��
}

