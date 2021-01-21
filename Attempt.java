package com;

public class Attempt {
	public static String method1(int bio, int chem, int phys) {
		String results = "SCORES\r\n";
		results += "Biology: " + bio + "/150\r\n";
		results += "Chemistry: " + chem + "/150\r\n";
		results += "Physics: " + phys + "/150\r\n";
		results += "Total: " + (bio + chem + phys) + "/450\r\n";
		return results;

	}

	public static double percentageResults(int bio, int chem, int phys) {
		double percentage = (100 * (bio + chem + phys)) / 450;
		return percentage;
	}

	public static void main(String[] args) {

		System.out.println(method1(50, 100, 70));
		System.out.println(percentageResults(50, 20, 70));

	}

}