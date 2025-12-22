package com.kh.chap01.condition;

import java.util.Scanner;

public class B_switch {
	/*
	 * switch문과 if문의 차이점
	 * if(조건식) => 조건식을 복잡하게 기술할 수 있음.
	 * switch은 조건식이 없으며, 확실한 값의 변수만 기술한다.
	 * 
	 * [표현법]
	 * switch (동등비교 수행 대상){
	 * case 값1 : 실행할 코드;
	 * 				break;
	 * case 값2 : 실행할 코드;
	 * 				break;
	 * ...
	 * default : 실행할 코드;
	 * }
	 * 
	 * switch문의 장점
	 * - case를 통해 내가 실행하길 원하는 코드로 프리패스 하기 때문에 if~else문
	 * 보다 *훨씬* 빠르다.
	 * 
	 * switch문
	 * 	- 자주 사용되지는 않지만, 정밀한 연산결과가 동일한 속도로 수행되어야 하는 경우
	 *   사용한다.
	 * - ex) 키보드입력, 마우스입력
	 */
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		/*
		 * 1 ~ 3사이의 정수값을 입력받아
		 * 1인 경우 빨간불
		 * 2인 경우 파란불
		 * 3인 경우 초록불
		 * 모두 아닌 경우 잘못 입력했습니다를 출력 
		 */
		System.out.print("input : ");
		int num1 = sc.nextInt();
//		if(num1 == 1) {
//			System.out.println("RED LIGHT");
//		}else if(num1 == 2) {
//			System.out.println("BLUE LIGHT");
//		}else if(num1 == 3) {
//			System.out.println("GREEN LIGHT");
//		}else {
//			System.out.println("ERROR");
//		}
		
		switch(num1) {
		case 1 :
			System.out.println("RED LIGHT");
			break;
		case 2 :
			System.out.println("BLUE LIGHT");
			break;
		case 3 :
			System.out.println("GREEN LIGHT");
			break;
		default :
			System.out.println("ERROR");
		}

	}
	public void method2() {
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일마다의 가격을 출력
		// 사과(2500), 바나나(2000), 포도(4000)
		
		System.out.println("KH 과일가게");
		System.out.print("과일 (사과, 바나나, 포도) : ");
		String fruit = sc.next();
		
		// == 동등성, equals 동등성
	
		int price = 0;
		switch(fruit) {
		case "사과":
			price = 2500;
			break;
		case "복숭아" :
			price = 2000;
			break;
		case "바나나" :
			price = 4000;
			break;
		default :
			break;
		}
		System.out.println(fruit + "의 가격은 " + price + "입니다.");
		
	}
}
