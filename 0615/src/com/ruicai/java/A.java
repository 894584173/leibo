package com.ruicai.java;

public class A {
	
	static int m=0;
	}
	class T{
	@SuppressWarnings("static-access")
	public static void main(String args[ ]) {
	A a=new A( );
	A b=new A( );
	a.m=1;
	b.m=2;
	System.out.println(a.m);
	   } 
}