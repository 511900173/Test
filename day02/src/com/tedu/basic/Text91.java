package com.tedu.basic;

public class Text91 {

	public static void main(String[] args) {
		//byte 1个字节 -2的7次方2的7次方-1
		byte bmax=Byte.MAX_VALUE;
		byte bmin=Byte.MIN_VALUE;
		System.out.println("byte的最大值是："+bmax);
		System.out.println("byte的最小值是："+bmin);
		//short 2个字节  -2的15次方到2的15次方-1
		short smax=Short.MAX_VALUE;
		short smin=Short.MIN_VALUE;
		System.out.println("short的最大值是："+smax);
		System.out.println("short的最小值是："+smin);
		//int  4个字节  -2的31次方到2的31次方-1
		int imax=Integer.MAX_VALUE;
		int imin=Integer.MIN_VALUE;
		System.out.println("int的最大值是："+imax);
		System.out.println("int的最小值是："+imin);
		//long 8个字节 -2的63次方到2的63次方-1
		long lmax=Long.MAX_VALUE;
		long lmin=Long.MIN_VALUE;
		System.out.println("long的最大值是："+lmax);
		System.out.println("long的最小值是："+lmin);
		//float 4个字节 单精度
		float fmax=Float.MAX_VALUE;
		float fmin=Float.MIN_VALUE;
		System.out.println("float的最大值是："+fmax);
		System.out.println("float的最小值是："+fmin);
		//double 8个字节  双精度
		double dmax=Double.MAX_VALUE;
		double dmin=Double.MIN_VALUE;
		System.out.println("double的最大值是："+dmax);
		System.out.println("double的最小值是："+dmin);
		//char 2个字节 
		char a='a';
		char a1='字';
		char a2='8';
		char a3=65;
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		//boolean  1个字节  只有true false;
		boolean boo1=true;
		boolean boo2=false;
		System.out.println(boo1);
		System.out.println(boo2);
		
	}
	
}
