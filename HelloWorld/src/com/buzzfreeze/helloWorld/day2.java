package com.buzzfreeze.helloWorld;

public class day2 {
	public static void main(String[] args) {
		lab13();
	}

	public static void ex1() {
		char[] myName = { 'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D' };
		String myWorld = new String(myName);
		System.out.println(myWorld);
	}

	public static void ex2() {
		String myString = "Firststring";
		String compare_string1 = "Firststring";
		String compare_string2 = "firststring";
		if (myString.equals(compare_string1)) {
			System.out.println("Equal to first comparison!");
		} else {
			System.out.println("Not Equal to first comparison!");
		}
		if (myString.equals(compare_string2)) {
			System.out.println("Equal to second comparison!");
		} else {
			System.out.println("Not Equal to second comparison!");
		}

	}

	public static void lab12() {
		String string1 = "You and Me";
		String string2 = " you and me ";
		System.out.println("Q1____________");
		if (string1.equals(string2)) {
			System.out.println("Equal to comparison!");
		} else {
			System.out.println("Not Equal to comparison!");
		}
		System.out.println("Q2____________");
		if (string1.contains("You")) {
			System.out.println("You Searched for You and it is in string1");
		} else {
			System.out.println("You Searched for You and it is NOT in string1");
		}
		if (string2.contains("You")) {
			System.out.println("You Searched for You and it is in string2");
		} else {
			System.out.println("You Searched for You and it is NOT in string2");
		}
		System.out.println("Q3____________");
		int length1 = string1.length();
		int length2 = string2.length();
		System.out.println("Length of string1: " + length1);
		System.out.println("Length of string2: " + length2);
		System.out.println("Q4_______________");
		System.out.println(string1.substring(1, 4));
		System.out.println(string2.substring(1, 4));
		System.out.println("Q5_______________");
		System.out.println(string1.trim());
		System.out.println(string2.trim());
		System.out.println("Q6_______________");
		System.out.println(string1.toUpperCase());
		System.out.println(string2.toUpperCase());
		System.out.println("Q7_______________");
		System.out.println(string2.toUpperCase().trim());
		System.err.println("");
		System.out.println("END OF LAB 12");
	}

	public static void lab13() {
		int[][] twoD_Array = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9 } };
		System.out.println("Q1_____________________________");
		for (int row = 0; row < twoD_Array.length; row++) {
			for (int column = 0; column < twoD_Array[row].length; column++) {
				System.out.print(twoD_Array[row][column]+" ");
			}
			System.out.println("");
		}
		System.out.println("Q2______________________________");
		int sum=0;
		for (int row = 0; row < twoD_Array.length; row++) {
			sum=sum+twoD_Array[row][twoD_Array[row].length-1];
		}
		System.out.println("The total of last array for each row is: "+ sum);
	}
}
