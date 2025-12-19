package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		
		String a = sc.nextLine();
		char b1 = a.charAt(0);
		System.out.println("첫 번째 문자 : " + b1);
		b1 = a.charAt(1);
		System.out.println("첫 번째 문자 : " + b1);
		b1 = a.charAt(2);
		System.out.println("첫 번째 문자 : " + b1);
	}
	public static void main(String[] args) {
		VariablePractice4 v4 = new VariablePractice4();
		v4.practice4();
		
	}
}
