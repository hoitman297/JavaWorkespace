package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("매뉴번호를 입력하세요 : ");
		int menu = sc.nextInt();
		
		if(menu == 7) {
			System.out.println("프로그램 종료");
			return ;
		}
		
		switch(menu) {
		case 1 : 
			System.out.print("입력");
			break;
		case 2 :
			System.out.print("수정");
			break;
		case 3 :
			System.out.print("조회");
			break;
		case 4 :
			System.out.print("삭제");
			break;
		//case 7 :
			//System.out.println("프로그램이 종료됩니다.");
			//return; 
			// 메서드 내 어디서든 사용가능
			// 현재 위치에서 메서드를 "종료"시키는 키워드
			//break;
		}
		System.out.println(" 메뉴입니다.");
	}

	public void method2() {
		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();
		
		// 양수인지아닌지 
		// 가드조건문
		//  - 조건을 만족하지 않으면 즉시 종료하는 패턴
		if(!(num > 0)) {
			System.out.println("양수만 입력하세요");
			return;
		}
		// 홀수인지 짝수인지
		if(num % 2 == 1) {
			System.out.println("홀수임다");
		}else {
			System.out.println("짝수임다");
		}
		
		// 중첩 if문 구조
		if(!(num > 0)) {
			System.out.println("양수만 입력해주세요.");
			return;
		}
		
		if (num % 2 == 0)
		{
			System.out.println("짝수다.");
		}else 
		{
			System.out.println("홀수다.");
		}
	}

	public void method3() {
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(!(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60)) {
			System.out.println("불합격 입니다.ㅠ");
			return;
		}		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("축하합니다, 합격입니다!");
	}

	public void method4() {
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		String season = "";
		switch(num) {
		case 1 , 2, 12 : 
			season = "겨울";
			break;
		case 3, 4, 5 : 
			season ="봄";
			break;
		case 6, 7, 8 :
			season ="여름";
			break;
		case 9, 10, 11 :
			season ="가을";
			break;
		default : 
			season = "잘못 입력된 달";
			System.out.println(num+"월은 잘못 입력된 달입니다.");
			return;
		}
		System.out.println(num+"월은 "+season+"입니다.");
	}

	public void method5() {
		String realId = "minmin";
		String realPwd = "Min1234";
		
		System.out.print("아이디 : ");
		String id = sc.next();
		
		System.out.print("비밀번호 : ");
		String pwd = sc.next();
		
//		if(id.equals(realId) && pwd.equals(realPwd)) {
//			System.out.println("로그인 성공");
//			return;
//		}
		
		if(!id.equals(realId)) {
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		
		if(!pwd.equals(realPwd)) {
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}
		
		System.out.println("로그인 성공");
	}
	
	public void practice6() {
		System.out.print("등급 : ");
		String grade = sc.next();
		
		switch(grade) {
		case "관리자" : 
			System.out.print("회원관리, 게시글관리, ");
		case "회원" :
			System.out.print("게시글작성, 댓글 작성, ");
		case "비회원" :
			System.out.print("게시글 조회");			
 		}
	}
	
	public void practice7() {
		System.out.print("키(m) : ");
		double height = sc.nextDouble();
		
		System.out.print("kg : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (height * height);
		System.out.println("BMI : "+ BMI);
		if(BMI < 18.5) {
			System.out.println("저체중");
		}
		else if(BMI < 23) {
			System.out.println("정상체중");
		}
		else if(BMI <25) {
			System.out.println("과체중");
		}
		else if(BMI < 30) {
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		
		System.out.print("피연산자 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		char ch = sc.next().charAt(0);
		
		if(!(num1 > 0 && num2 >0 && 
				(ch == '+' || ch == '-' || ch == '*' || ch =='/' || ch == '%')
				)) {
			System.out.println("잘못입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		switch(ch) {
		case '+' :
			System.out.println(num1 + ch + num2+" = "+ (num1+num2));
			break;
		case '-' :
			System.out.println(num1 + ch + num2+" = "+ (num1-num2));
			break;
		case '*' :
			System.out.println(num1 + ch + num2+" = "+ (num1*num2));
			break;
		case '/' :
			System.out.println(num1 + ch + num2+" = "+ (num1 /(double) num2));
			break;
		case '%' :
			System.out.println(num1 + ch + num2+" = "+ (num1 % num2));
			break;
		}
	}
	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		int midTest = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finalTest = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int report = sc.nextInt();
		
		System.out.print("출석 점수 : ");
		int attend = sc.nextInt();
		
		double total = midTest * 0.2 + finalTest * 0.3 + report * 0.3 + attend;
		
		if(attend <= 14) {
			System.out.println("Fail [출석 회수 부족 ("+attend+"/20)]");
			return;
		}
		
		System.out.println("총점 : "+total);
		if(total < 70 ) {
			System.out.println("Fail");
		}else {
			System.out.println("PASS");
		}
	}
		
	public void practice10() {
		
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			method1();
			break;
		case 2:
			method2();
			break;
		case 9:
			practice9();
			break;
		}
	}
	
	public void practice11() {
		System.out.print("비밀번호 입력 : (1000 ~ 9999) : ");
		int pwd = sc.nextInt();
		
		if( !(pwd >= 1000 && pwd <= 9999)) {
			System.out.println("자리 수 안 맞음");
			return;
		}
		
		int first = pwd / 1000; // 1234 / 1000 = 1(.234)
		int second = pwd / 100 % 10; // 1234 / 100 => 12(.34) % 10 => 2
		int third = pwd / 10 % 10; // 1234 / 10 => 123 % 10 => charAt(2)
		int fourth = pwd % 10; // 1234 % 10 => 4
		
		if(first == second || first == third || first == fourth
				|| second == third || second == fourth || third == fourth) {
			System.out.println("중복값 있음");
		}else {
			System.out.println("생성 성공");
		}
	}
}














