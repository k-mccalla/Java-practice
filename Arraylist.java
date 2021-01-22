package com;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		List<String> sandwiches = new ArrayList<>();

		// elements

		sandwiches.add("bread sandwich"); // 0
		sandwiches.add("pop tart"); // 1
		sandwiches.add("hot dog"); // 2
		sandwiches.set(0, "ice cream taco"); // 3
		sandwiches.size();
		for (String i : sandwiches){

			{
				System.out.println(i);
			}
		}for (int i = 0; i < sandwiches.size(); i++) {
			System.out.println(i);
//use .get() for specific element
		}
	}
}