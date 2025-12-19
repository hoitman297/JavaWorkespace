package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("성병을 입력하세요(남/여) : ");
		char gender = sc.next().charAt(0);//zㅋㅋㅋㅋㅋㅋㅁㄴㅇㄻㅇㄻㄴㅇㄹasdfasdfsadfasdf
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double hi = sc.nextDouble();
		
		System.out.println("키 " + hi + "cm인 " + age +"살 " + gender + "자 " + name + "님 반갑습니다!");
		
	}
}
