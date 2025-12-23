package com.kh.chap02.loop;

import java.util.Iterator;

public class A_For {
	/*
	 * <반복문>
	 * 실행할 코드를 반복적으로 수행시킬 수 있도록 도와주는 제어문
	 * 크게 for문과 while문으로 나뉜다.
	 * 
	 * <표현법>
	 * for(초기식; 조건식; 증감식){
	 * 		반복적으로 수행할 코드
	 * 	}
	 * 
	 * 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행" 되는 구문
	 * 			   (반복문에서 사용할 변수를 선언 및 초기화)
	 * 			   ex) int i = 0;
	 * 조건식 : "반복문이 수행될 조건" 을 작성하는 구문
	 * 			   조건식이 true일 경우 반복문이 수행.
	 *            조건식이 false인 경우 반복문이 종료.
	 *            (보통 초기식에서 제시된 변수를 사용하여 조건식을 작성)
	 *            ex) i < 10;
	 * 증감식 : 반복문을 제어하는 변수값을 "증감" 시키는 구문
	 *            (보통 초기식에서 제시된 변수를 증감함)
	 *            ex) i++, ++i
	 *            
	 * for문 실행흐름
	 * 1. 초기식 실행
	 * 2. 조건식
	 * 3_1. 조건식 결과가 참이라면 for문 내부 코드 실행
	 * 3-2. 조건식 결과가 거짓이라면 for문 종료
	 * 4. for문 내부 코드 실행 후 증감식 실행.
	 * 5. 다시 조건식부터 쭉 반복 실행.
	 */
	public void method1() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	public void method2() {
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
	}
	public void method3() {
		for (int i = 0; i < 10; i++) {
//			System.out.println(i + " ");
			if (!( i % 2 == 0)) {
				System.out.print(i + " ");
			}
		}
	}
	public void method4() {
		int sum = 0;
		for (int i = 0; i <= 10; ++i) {
			sum += i;
		}
		System.out.println(sum);
	}
	public void method5() {
		//1에서부터 매번 달라지는 "랜덤값"까지의 총 합계
		/*
		 * java.lang.Math 클래스의 random()를 호출하면,
		 * 매번 다른 "실수형"의 랜덤값을 얻어올 수 있다.
		 * 
		 * 랜덤값의 범위
		 * 0.0 <= 랜덤값 < 1.0
		 * 
		 * 만약 1과 10사이의 랜덤값을 얻고 싶다면?
		 * 1. 우선 10을 곱하기
		 * 0.0 <= 랜덤값 < 10.0
		 * 
		 * 2. 1 더하기
		 * 1.0 <= 랜덤값 < 11.0
		 * 
		 * 3. 소수점 버리기
		 * 1 <= 랜덤값 <= 10
		 * 
		 * 코드 => 랜덤값 * 10 + 1
		 * 10 => 출력하고자 하는 개수
		 * 1 => 시작숫자
		 * Math.random() * 10 + 1
		 * 
		 */
		int random = (int)(Math.random() * 10 + 1);
		System.out.println("랜덤값 : " + random);
		int sum = 0;
		for(int i = 1; i<=random; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public void method6() {
		String str = "This is Myoung Ji Won";
		//	System.out.println(str.charAt(0));
		for (int i = 0; i < str.length(); i++) { //변수명.length() 문자열 길이
			System.out.print(str.charAt(i));
		}
	}
	public void method7() {
		//구구단
		int result = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				result = i * j;
				System.out.println(i + " X " + j + " = " + result);
			}
			System.out.print("\n");
		}
	}
	public void method8() {
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == i) System.out.print(i + 1);
				else System.out.print("*");
			}
			System.out.println();
		}
			
	}
	public static void main(String[] args) {
		A_For af = new A_For();
		af.method9();
	}
}
