package com.nazmul.JavaDoc;

public class MethodJava {

	public static void main(String[] args) {
		int x =10;
		int y = 20;
		
		int c = x+y;
		System.out.println("C : -> "+ c);
		
		f(x,y);
		int res= g(x,y);
		System.out.println("res : "+ res);
	}

	 private static int g(int x, int y) {
		 System.out.println("x : "+ x+ " y : + y");
			int c = x+y;
			//System.out.println("G -> add : "+c);
			return c ;
	}
	 

	static void f(int x, int y) {
		System.out.println("x : "+ x+ " y : + y");
		int c = x+y;
		System.out.println("F -> add : "+c);
		return ;
	}

}
// f(x, y) = x^2+2xy+y;..... -> 18