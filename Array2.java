package com;

public class Array2 {

	public static void main(String[] args)
	//Multi-dimensional array 
	{
	
	int[][] ageArray = { {3,5,6}, {50,40,21}, {8,9,7}};
	String[][] nameArray = new String[3][2];
	nameArray[1][1] ="John";
	nameArray[2][1] = "Jordan";
	
	//For-each
	
	for (int[] a : ageArray) {
		for (int b : a) {
			System.out.println(b);
		}
		
		
		// for loop
		for (int i = 0; i < ageArray.length; i++) {
			for (int j = 0; j < ageArray[i].length; j++) {
				System.out.print(ageArray[i][j]);
			}
		}
		
	}
}	
	
}	

