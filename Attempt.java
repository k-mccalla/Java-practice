package com;

public class Attempt {
	public static void method1() {
		int Physics = 150;
		System.out.println(Physics);
		int Chemistry = 150;
		System.out.println(Chemistry);
		int Biology = 150;
		System.out.println(Biology);

		int result = Physics + Chemistry + Biology;
		System.out.println(result);
	}

	public static void method2() {
		int percentage =  100 / 450 * result;
		System.out.println(percentage);
	}

	public static void main(String[] args) {
		method1();
		method2();

	}
	
}