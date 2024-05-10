package com.method;

public class Test {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

		

	public static void main(String[] args) {

		Test t1 = new Test();
		t1.add(10, 20);
		t1.sub(10, 20);
	}

}
