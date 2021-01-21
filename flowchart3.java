package com;

public class flowchart3 {

	public static void Chart() {

		int A = 2000;

		if (A > 2000) {
			System.out.println("A");
			if (A > 6000) {
				System.out.println("C");

			} else {
				System.out.println("b");
			}
			if (A > 4000) {
				System.out.println("D");
			} else {

				System.out.println("E");
			}
		} else {

			System.out.println("1");
			if (A < 100) {
				System.out.println("S");

			} else {
				System.out.println("6");

			}
		}

	}
public static void main (String []args ) {
	Chart();
}
}
