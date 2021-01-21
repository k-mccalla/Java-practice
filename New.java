package com;

public class New {

	static int sumMulti(int num1,int num2, boolean sum) {
		if (sum) {
			return num1 + num2;
		}else {
			return num1 * num2;
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println(sumMulti(5,5, false));

}
}