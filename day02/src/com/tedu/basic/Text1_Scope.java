package com.tedu.basic;
//测试取值范围 
public class Text1_Scope {

	public static void main(String[] args) {
		//定义变量记录最大值最小值
		//三要素：变量类型 变量名=变量值
		//定义变量记录byte类型的最大值
		byte bmax=Byte.MAX_VALUE;
		byte bmin=Byte.MIN_VALUE;
		//打印变量的值   syso alt+/ 快捷键 
		System.out.println(bmax);// 127
		System.out.println(bmin);// -128
		
		short smax=Short.MAX_VALUE;//32767
		short smin=Short.MIN_VALUE;//-32768
		System.out.println(smax);
		System.out.println(smin);
		
		int imax=Integer.MAX_VALUE;//2147483647
		int imin=Integer.MIN_VALUE;//-2147483648
		System.out.println(imax);
		System.out.println(imin);
		
		long lmax=Long.MAX_VALUE;//9223372036854775807
		long lmin=Long.MIN_VALUE;//-9223372036854775808
		System.out.println("long");
		System.out.println(lmax);
		System.out.println(lmin);
		
		float fmax=Float.MAX_VALUE;//3.4028235E38
		float fmin=Float.MIN_VALUE;//1.4E-45
		System.out.println(fmax);
		System.out.println(fmin);
		
		double dmax=Double.MAX_VALUE;//1.7976931348623157E308
		double dmin=Double.MIN_VALUE;//4.9E-324
		System.out.println(dmax);
		System.out.println(dmin);
		
		
		char c1='h';//字符串 ' 字符
		char c2='o';
		char c3='我';//char可以存一个汉字
		char c4=65;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		//字符类型最终的输出结果就是一个字符
		//能够把98换算成字符b；
		//因为char类型底层会查ascii码表
		//ascii码表里规定了0-127对应的字符，
		//码表里没有的数字，都按照？这个字符来处理
		
		boolean boomax=true;
		boolean boomin=false;
		System.out.println(boomax);
		System.out.println(boomin);
		/*
		 * byte     1个字节
		 * short    2个字节
		 * integer  4个字节
		 * long     8个字节
		 * float    4个字节
		 * double   8个字节
		 * char     1个字节
		 * boolean  2个字节
		 */
		

	}

	
	
	
	
	
	
	
	
}
