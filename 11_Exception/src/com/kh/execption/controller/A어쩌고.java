package com.kh.execption.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A어쩌고 {
	Scanner sc = new Scanner(System.in);
	/*
	 		UncheckedException
	 		 - RuntimeExecption 처럼 프로그램 실행시 발생되는 예외들이 대표적인 Unchecked
	 		 	 Exception계열의 예외들이다.
	 		 - RuntimeException의 자식 클래스들
	 		 	1. ArrayIndexOutOufBoundsException
	 		 	2. NegativeArraySizeException
	 		 	3. ClassCastExecption
	 		 		- 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 		 		- ex) p1이 Child2객체로 생성된 참조변수일 때,
	 		 				(Child1) p1 등을 수행하는 경우
	 		 	4. NullPointerException
	 		 		- 참조변수가 null인 상황에서 특정 메서드 및 필드에 접근하려고 할때 발생하는 예외
	 		 	5. ArithmeticException
	 		 	....
	 		 	
	 		 	=> 이러한 RuntimeExecption과 관련한 예외는 충분한 예측가능한 상황이다.
	 		 		예외 처리가 애초에 발생이 안되게끔, 대부분 조건문으로 해결이 가능하다.
	 		 		즉, 굳이 예외처리 (예외처리코드들)를 할 필요가 없다는 의미.
	 		 	
	 */
	public void method1() {
		//ArithmetcException
		//	- 나누기 연산시 0으로 나눌 때 발생
		
		System.out.println("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		// 예외처리 방법 1) 조건문으로 애초에 예외가 발생하지 않게끔 처리한다.
		if(num2 ==0) {
			System.out.println("0으로 나눌 수 없습니다.");
		} else {
			System.out.println("나눗셈 연산 결과 : " + (num1 / num2));
		}
		
		//예외처리 방법 2) try ~ catch 문으로 해결하기
		/*
				- 예외가 발생했을 경우를 대비해서 실행할 내용을 정희해 두는 문법
				[표현법]
				try{
					//예외가 발생할 수 있는 코드
				} catch(발생될 수 있는 예외 클래스){
					//해당예외가 발생시 실행할 구문
				}
		 */
		try {
			// ArithmeticExecption이 발생할 수 있는 코드.
			System.out.println("나눗셈 연산 결과 : " + (num1/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 오류를 로그로 출력하는 기능
		}
		System.out.println("프로그램 종료");
	}
	
	
	public void method2() {
		System.out.println("정수 입력 (0 제외) :");
		
		try {
		int num = sc.nextInt();
		System.out.println("나눗셈 연산 결과 :"+(10/num));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (InputMismatchException i) {
			System.out.println("정수를 제대로 입력하세요");
		}
		
		System.out.println("프로그램 종료");
	}
	
	public void method3() {
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		
		// 처리방법1. 다중 catch블럭
//		try {
//			int[]arr = new int[size];
//			System.out.println("100번째 인덱스의 값 : " + arr[100]);
//		} catch(NegativeArraySizeException e) {
//			System.out.println("배열의 크기는 음수일 수 없습니다.");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("부적절한 인덱스입니다.");
//		}
		
		//처리방법2. 다형성을 이용한 catch
		try {
			int[] arr = new int[size];
			System.out.println("100번째 인덱스의 값 : " + arr[100]);
			
		//다중 catch 블럭 작성시 범위가 작은 자식 클래스를 먼저 기술해야 한다.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 인덱스 접근입니다.");
		} catch (RuntimeException e) { //다형성 적용
			System.out.println("예외가 발생했습니다"); //정확히 어떤 예외가 발생했는지 파악할 수 없다.
			e.printStackTrace();
		}
		
		/*
		 	RuntimeException 관련된 예외는
		 	- 조건문으로 해결이 가능하기 때문에 예외 자체가 애초에 발생 안되게끔 개발자가 소스코드로 핸들링하는게 권장 된다.
		 	- 예외처리 구문으로도 해결이 가능하긴 하다.
		 	
		 	예측이 가능한 상황 => 조건문으로 해결
		 	예측이 불가능한 상황 => 예외처리 구문으로 해결
		 */
	}

}
