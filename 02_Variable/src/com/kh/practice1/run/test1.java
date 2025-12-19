package com.kh.practice1.run;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert = ");
		String firstname = sc.next();
		sc.nextLine();
		String lastname = sc.nextLine();
		
		System.out.println(firstname + lastname);
		System.out.println(firstname);
		System.out.println(lastname);
		
	}
}
