package com.kh.chap02.loop;

import java.util.Scanner;

public class A_Break {

	Scanner sc = new Scanner(System.in);
	
	/*
	 	break : 코드 실행 중 break문을 만나게 되면 현재 속해있는 가장 가까운
	 	반복문을 빠져나간다.
	 */
	
	public void 제1_메소드() {
		//매번 반복적으로 랜덤값 (1~100)를 출력
		//단 출련된 값이 3의 배수인 경우 반복을 종료.
		while(true) {
			int random = (int)(Math.random()* 100 + 1);
			System.out.println("output : " + random);
			
			if(random % 3 == 0) {
				break;
			}
		}
	}
	
	 public void 제2_메소드() {
		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc .next();
			
			if (str.equals("EXIT")) {
				System.out.println("종료");
				break;
			}
			
			
			System.out.println(str + "글자수 : " + str.length());
		}
	}
	 public void 제3_메소드() {
		 int sum = 0;
		 int max,num = 0;
		// 매번 반복적으로 사용자에게 양수를 입력받아 1부터 사용자가 입력한 값까지
		// 출력하는 프로그램을 작성하시오.

		 while (true) {
				System.out.print("input : ");
				max = sc.nextInt();
				if (max <= 0) {
					continue;
				}
				for (int i = 0; i <= max; i++) {
					System.out.println(i + " ");
				}
				break;

			 
		 }
	 }
	 public void 제4_메소드() {
		 
		 
		 loop1: //심블
		for (int i = 0; i < 10; i++) {
			loop2:
			for (int j = 0; j < 10; j++) {
				System.out.println(i);
				if(i==5) break loop1;
				//break 가장 가까운 반복문 탈출.
			}
		}
	}

	public static void main(String[] args) {
		A_Break ab = new A_Break();
		ab.제3_메소드();
	}
}
