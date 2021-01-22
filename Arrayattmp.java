package com;

public class Arrayattmp {


		
		//array
public static int numbersArray [] = {10, 20, 30, 40, 50};
		
	public static void main(String[] args) {	
		
		for (int n : numbersArray) {
		
	for (int j = 0; j < numbersArray.length; j++) {
			if (numbersArray[j] == n) {
				
			System.out.println("n:" + n + "j:" + j + "n and j match");
			
		
			}
		}
			
		
		
		}
		
		
		
	}

}
