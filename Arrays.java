package com;

public class Arrays {

	public static void main(String[] args) {
	//Arrays
	int [] ageArray = { 1, 2, 3, 4, 5, 6};
	String[] nameArray = {"John", "Mary", "Alex", "Pat"};
	
	// For loop- prints out age array
	
	for (int i = 0; i < ageArray.length; i++) {
		
	System.out.println(ageArray[i]); 	
	}
	
	// For-each loop (enhanced for loop)- prints out name array
	
	for (String name: nameArray ) {
		System.out.println(name);
	}
	
	
	
	
}
}