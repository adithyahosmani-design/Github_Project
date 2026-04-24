package com.java;

public class FisrtProgram {
	void print() {
		System.out.println("Welcome to my github session 2");
		System.out.println("hello guys");
		
	}
	int add(int a,int b ) {
		return a+b;
	}
	public static void main(String[] args) {
		FisrtProgram fp=new FisrtProgram();
		fp.print();
		
		int result = fp.add(10,10);
		System.out.println("sum"+result);
		
	}

}
