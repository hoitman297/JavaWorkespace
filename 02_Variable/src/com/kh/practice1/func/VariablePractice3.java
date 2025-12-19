package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 : ");
		double a = sc.nextDouble();
		System.out.print("세로 : ");
		double b = sc.nextDouble();
		double result1 = a * b;
		double result2 = (a + b) * 2;		
		System.out.println("면적 : " + result1);
		System.out.println("둘레 : " + result2);
	}
}
