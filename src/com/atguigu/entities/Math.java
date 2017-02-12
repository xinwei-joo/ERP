package com.atguigu.entities;

public class Math {
	public static  int add(int a, int b){
		return a + b;
	}
	public static int sub(int a, int b){
		return a - b;
	}
	
	public static int div(int a, int b){
		int result = 0;
		if(b!=0)
			result = a / b;
		
		return result;
	}
	
}
