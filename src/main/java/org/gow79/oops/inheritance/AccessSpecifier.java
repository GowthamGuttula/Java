package org.gow79.oops.inheritance;

import java.io.FileNotFoundException;

public class AccessSpecifier extends B {

	public static void main(String a[]) {
		System.out.println(new AccessSpecifier());
	}
	
	public static void X()  throws NullPointerException  {
		System.out.println("C X");
	}
}

class A{
	A(){
		System.out.println("A");
	}
	
	static void X() throws Exception {
		System.out.println("A X");
	}
	
	int abc(String s) {
		
		return 1;
	}
	
	long abc(String s,String x) {
		return 1;
	}
}

class B extends A{
	B(){
		System.out.println("B");
	}
	
	protected static void X() throws FileNotFoundException  {
		System.out.println("B X");
	}
}
