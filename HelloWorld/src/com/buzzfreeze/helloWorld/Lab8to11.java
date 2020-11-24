package com.buzzfreeze.helloWorld;

public class Lab8to11 {
	public static void main(String[] args) {
		lab8();
		lab9();
		lab10();
		String name1 = "Time"; String name2= "Tad";
		String comment = lab11(name1, name2);
		System.out.println(comment);
	}
	public static void lab8() {
		for (int count = 0; count < 20; count++) {
			if(count==11) {
				System.out.println(count);
				break;
			}
			System.out.println(count);
		}
	}
	public static void lab9() {
		for (int count = 0; count <= 20; count++) {
			if(count==11) {
				continue;
	
			}
			System.out.println(count);
		}
	}
	public static void lab10() {
		int j=1;
		while(j<=10) {
			for(int i=1; i<=10; i++) {
				if(i==2) {continue;}
				System.out.println(i);
			}
		System.out.println(j+" times");
		j++;
		}
	}
	public static String lab11(String n1,String n2) {
		return n1+" Is "+n2+"'s partner for this lab...";
	}

}
