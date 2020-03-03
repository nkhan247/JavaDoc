package com.nazmul.JavaDoc;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 10;
		int c = a+b;
		System.out.println(c);
		
		A ref;
		ref = new A();
		System.out.println(ref.data);
		ref.method();
	}

}
