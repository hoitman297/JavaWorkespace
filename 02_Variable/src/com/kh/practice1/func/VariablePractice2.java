package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		
		System.out.println("더하기 결과 : " + (a + b));
		System.out.println("빼기 결과 : " + (a - b));
		System.out.println("곱하기 결과 : " + (a*b));
		System.out.println("나누기 몫 결과 : " + (a/b));
		System.out.println("나누기 나머지 결과 : " + (a-(b*(a/b))) );
	}
	public static void main(String[] args) {
		VariablePractice2 v2 = new VariablePractice2();
		v2.practice2();
		
	}
}
