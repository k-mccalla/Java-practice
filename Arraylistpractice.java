package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collections;

public class Arraylistpractice {

	public static void main(String[] args) {
		
       List<Integer> years = new ArrayList<>();
		
		//elements
       
       years.add(2010); 
       years.add(2009);
       years.add(2007);
       years.add(2001);
       years.add(1994);
       years.add(1983);
       years.add(1985);
       years.add(2011);
	
       Collections.sort(years); 
       
       System.out.println(years.get(1));
       
	for (int i : years) {
		System.out.println(i);
	}
	for (int i = 0; i < years.size(); i++) {
		System.out.println(i);
	}
	
	
	
	}	
}
