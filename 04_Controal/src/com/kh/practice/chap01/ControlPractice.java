package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num1 = sc.nextInt();
		switch (num1) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("종료 메뉴입니다.");
			break;
		default:
			break;
		}
	}
	
	public void practice2(){
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {		
			if(num%2 == 0) {
			System.out.println("짝수");
		} else if(num%2 > 0) {
			System.out.println("홀수");
		} else {
			System.out.println("양수만 입력하세요");
		}
	} else
		System.out.println("양수만 입력하세요");
}
	
	public void practice3(){
		System.out.print("국어점수 : ");
		int num1 = sc.nextInt();
		System.out.print("수학점수 : ");
		int num2 = sc.nextInt();
		System.out.print("영어점수 : ");
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		double result = sum / 3;
		if(!(num1 >= 40 && num2 >= 40 && num3 >= 40 && result >= 60)) {
				System.out.println("불합격입니다.");
				return;
		}
		System.out.println("국어 : " + num1);
		System.out.println("수학 : " + num2);
		System.out.println("영어 : " + num3);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + result);
		System.out.println("축하합니다! 합격입니다.");
	}
	
	public void practice4(){
		System.out.print("1 ~ 12사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch (month) {
		case 3,4,5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6,7,8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9,10,11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12,1,2:
			System.out.println(month + "월은 겨울입니다.");
			break;

		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;
		}
//		if(month == 1 || month == 2 || month == 12)
//		{
//		season = "겨울";
//		} else if(month >= 3 && month <= 5) {
//		season = "봄";
//		} else if(month >= 6 && month <= 8) {
//		season = "여름";
//		} else if(month >= 9 && month <= 11) {
//		season = "가을";
//		} else {
//		season = "해당하는 계절이 없습니다.";
//		}
	}
	
	public void practice5(){
		System.out.print("id : ");
		String id = sc.nextLine();
		System.out.print("password : ");
		String pd = sc.nextLine();
		
		if(id.equals("mjw040608") && pd.equals("hoitman297!")) {
			System.out.println("login");
		} else if(id.equals("mjw040608")){
			System.out.println("password error");
		} else if(pd.equals("hoitman297!")){
			System.out.println("id error");
		} else {
			System.out.println("error");
		}
	}

	public void practice6(){
		System.out.print("권환을 확인하고자 하는 회원 등급 : ");
		String m = sc.nextLine();
		switch (m) {
		case "관리자":
			System.out.print("회원관리, 게시글 관리, ");
		case "회원":
			System.out.println("게시글 작성, 댓글 작성, ");
		case "비회원":
			System.out.println("게시글 조회");
		default:
			System.out.println("다시 입력해주세요.");
			break;
		}
	}

	public void practice7(){
		System.out.print("키(m)를 입력해주세요 : ");
		double hi = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		double kg = sc.nextDouble();
		double bmi = kg / (hi * hi);
		System.out.println("bmi 지수 : " + bmi);
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi >= 23) {
			System.out.println("과체중");
		} else if(bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}
		
	}

	public void practice8(){
		System.out.print("number1 input : ");
		double num1 = sc.nextDouble();
		
		System.out.print("number2 input : ");
		double num2 = sc.nextDouble();
		
		System.out.print("operator input : ");
		char op = sc.next().charAt(0);
		
		double sum = 0;
		
		if(!(num1 > 0 && num2 > 0)) {
			System.out.println("error");
			return;
		}
		
		switch (op) {
		case '+':
			sum = num1 + num2;
			break;
		case '-':
			sum = num1 - num2;
			break;
		case '*':
			sum = num1 * num2;
			break;
		case '/':
			sum = num1 / num2;
			break;
		case '%':
			sum = num1 % num2;
			break;
		default:
			System.out.println("error");
			return;
		}
			System.out.println(((int)num1) + " "+ op + " " +((int)num2) + " = " + sum);
	}

	public void practice9() {
		System.out.print("중간 고사 점수");
		double num1 = sc.nextDouble();
		
		System.out.print("기말 고사 점수");
		double num2 = sc.nextDouble();
		
		System.out.print("과제 점수");
		double num3 = sc.nextDouble();
		
		System.out.print("출석 회수");
		double num4 = sc.nextDouble();
		
		double sum = (num1 *0.2) + (num2 *0.3) + (num3 *0.3) + (num4);
		if(num4 <= (20 - (20*0.3))) {
			System.out.println("Faill [출석 회수 부족 (" + num4 + "/" + "20) ]" );

		}else if (sum < 70.0) {
			System.out.println("Fasil [점수 부족]");

		}else if(sum >= 70) {
			System.out.println("중간 고사 점수(20) : " +  (num1 * 0.2));
			System.out.println("기말 고사 점수(30) : " +  (num2 * 0.3));
			System.out.println("과제 점수(30) : " +  (num3 * 0.3));
			System.out.println("출석 점수(20) : " +  (num4));
			System.out.println("총점 : " +  sum);
			System.out.println("PASS");
		}
		
	}

	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6.권환 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int num1 = sc.nextInt();
		switch(num1) {
		case 1 :
			practice1();
			break;
		case 2 :
			practice2();
			break;
		case 3 :
			practice3();
			break;
		case 4 :
			practice4();
			break;
		case 5 :
			practice5();
			break;
		case 6 :
			practice6();
			break;
		case 7 :
			practice7();
			break;
		case 8 :
			practice8();
			break;
		case 9 :
			practice9();
			break;
		}

	}

	public void practice11() {
		System.out.print("input ");
		int inum = sc.nextInt();
		if (inum < 1000 || inum > 9999) {
			System.out.println("자리수 초과");
			return;
		}

		int num1 = inum / 1000;// 천자리
		int num2 = (inum / 100) % 10;// 백자리
		int num3 = (inum / 10) % 10;// 십자리
		int num4 = inum % 10;// 일자리

		if (num1 == num2 || num1 == num3 || num1 == num4 || num2 == num3 || num2 == num4 || num3 == num4) {
			System.out.println("중복");
		} else {
			System.out.println("성공");
		}
	}
} //return
// 메서드 내 어디서든 사용가능
//현재 위치에서 메서드를 종료시키는 키워드