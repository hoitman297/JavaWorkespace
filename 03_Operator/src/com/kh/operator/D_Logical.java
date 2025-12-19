package com.kh.operator;

import java.util.Scanner;

public class D_Logical {
	/*
	 * 논리연산자
	 * - 논리 값 두개를 비교하는 연산자
	 * AND && : a && b -> a와 b가 모두 참일 경우 true 반환. (둘 중 하나라도 거짓이면 false)
	 * OR || : a || b -> a와 b 중 하나라도 참일 경우 true 반환. (둘 다 거짓인 경우 false)
	 * 
	 * ~ 하면서 -> AND
	 * 또는 -> OR
	 */
	Scanner sc = new Scanner(System.in);

	public void method() {
		System.out.print("input : ");
		int a = sc.nextInt();

		boolean result = a > 0 && (a % 2) == 0;

		// num의 값이 0보다 크면서 짝수입니까?
	}

	public void method2() {
		// 입력한 값이 1 이상 100 이하의 숫자인지 확인.
		// 1 <= x <= 100
		System.out.println("input : ");
		int x = sc.nextInt();
		boolean result = 1 <= x && x <= 100;

	}

	public void method3() {
		// 사용자가 입력한 값이 'y' 거나 'Y'인 경우 참, 아니면 거짓을 반환하시오.
		System.out.println("input : ");
		char text1 = sc.next().charAt(0);
		boolean result = text1 == 'y' || text1 == 'Y';
	}
	
	public void method4() {
		int num1 = 10;
		//and연산자의 경우 A && B의 조건 중 A의 값이 false인 경우
		//뒤 쪽 조건들이 뭐든 무조건 false이기 때문에 뒤쪽 조건식은 실행하지 않는다.
		boolean result1 = (num1 < 5) && (num1++ > 0); // 거짓!
		System.out.println("결과는 무엇인가 : " + result1);
		
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		System.out.println(num2); //10
	}

	public static void main(String[] args) {
		D_Logical dl = new D_Logical();
		dl.method4();
	}

}