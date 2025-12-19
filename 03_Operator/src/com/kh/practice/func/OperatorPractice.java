package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("인원 수 :");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 :");
		int num2 = sc.nextInt();

		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남은 사탕 개수 : " + (num2 % num1));

	}
	
	
	

	public void practice2() {

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int cla = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char 성별 = sc.next().charAt(0);
		String 성별1 = 성별 == 'M' ? "남학생" : "여학생";
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double 성적 = sc.nextDouble();

		System.out.println(grade + "학년 " + cla + "반 " + num + "번 " + name + " " + 성별1 + "의 " + "성적은 " + 성적 + "이다. ");
	}
	
	
	
	
	public void practice3() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String str = age <= 13 ? "어린이" :
			(age > 13 && age <=19 ? "청소년" : "성인");
		System.out.println("\n");
		System.out.println(str);
	}
	
	
	
	public void practice4() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int mth = sc.nextInt();
		
		int sum = kor + eng + mth;
		double avg = sum/3.0;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		String str = kor >= 40 && eng >= 40 && mth >= 40 ? (avg >= 60 ? "합격" : "불합격") : "불합격" ;
		System.out.println(str);
	}
	
	
	
	public void practice5() {
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char num = sc.next().charAt(7);
		System.out.println();
		String str = num == '1' || num == '3'? "남자" : (num == '2' || num == '4'? "여자" : "다시 입력해주세요.");
		System.out.println(str);
	}
	
	
	
	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println();
		
		boolean tf = num1 < num2 ? (num1 >= num3 || num2 < num3? true : false) : false; 
		System.out.println(tf);
	}
	
	
	
	
	public void practice7() {
		System.out.print("input1 : ");
		int num1 = sc.nextInt();
		System.out.print("input2 : ");
		int num2 = sc.nextInt();
		System.out.print("input3 : ");
		int num3 = sc.nextInt();
		
		boolean tf = num1 == num2 && num2 == num3 && num1 == num3? true : false;
		
		System.out.println(tf);
	}
	
	
	
	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int num1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int num2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int num3 = sc.nextInt();
		
		double num1_a = num1 + (num1 * 0.4);
		double num2_a = (int)num2;
		double num3_a = num3 + (num3 * 0.15);
		
		System.out.println("A사원 연봉/연봉+a : " + num1 + "/" + num1_a);
		System.out.println(num1 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원 연봉/연봉+a : " + num2 + "/" + num2_a);
		System.out.println(num2 >= 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원 연봉/연봉+a : " + num3 + "/" + num3_a);
		System.out.println(num3 >= 3000 ? "3000 이상" : "3000 미만");	
	}
}
