package com.kh.practice.chap02.loop;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	int num = 0;

	public void practice1() {
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상 숫자를 입력해라!");
				continue;
			}
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void practice2() {
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상 숫자를 입력해라!");
				continue;
			}
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int i;
		int sum = 0;
		for (i = 1; i < num; i++) {
			System.out.print(i + " + ");
			sum += i;
		}
		sum += i;
		System.out.print(i + " = " + sum);
	}

	public void practice4() {
		int num1 = 0;
		int num2 = 0;
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();

			if (num1 <= 0 || num2 <= 0) {
				continue;
			} else if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
				System.out.println();
			}
		}
	}

	public void practice5() {
		int num = 0;
		while (true) {
			System.out.println("숫자 : ");
			num = sc.nextInt();
			if (num > 9) {
				System.out.println("9 이하의 숫자만 입력");
				continue;
			}
			for (int i = num; i < 10; i++) {
				System.out.println("====== " + i + "단 " + "======");
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " X " + j + " = " + (j * i));
				}
			}
		}
	}

	public void practice6() {
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		while (true) {
			System.out.print("시작 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("공차 : ");
			num2 = sc.nextInt();
			sum = num1;
			for (int i = 0; i < 10; i++) {
				System.out.print(sum + " ");
				sum += num2;
			}
			break;
		}
	}

	public void practice7() {
		String ch;
		char su;
		int sum = 0;
		int num1, num2 = 0;
		while (true) {
			System.out.println("연산자 (+, -, *, /, %) : ");
			ch = sc.next();
			su = ch.charAt(0);

			if (ch.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println("정수 1 : ");
			num1 = sc.nextInt();
			System.out.println("정수 2 : ");
			num2 = sc.nextInt();
			if (su == '/' && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하십쇼.");
				continue;
			}
			switch (su) {
			case '+':
				sum = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + sum);
				continue;
			case '-':
				sum = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + sum);
				continue;
			case '*':
				sum = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + sum);
				continue;
			case '/':
				sum = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + sum);
				continue;
			case '%':
				sum = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + sum);
				continue;
			default:
				System.out.println("없는 연산자입니다. 다시 입력하시오");
				continue;
			}

		}
	}

	public void practice8() {
		System.out.print("input : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice9() {
		System.out.print("input : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void practice10() {
		int num1 = 0;
		System.out.print("input : ");
		num1 = sc.nextInt();

		if (num1 < 2) {
			System.out.println("Error");
			return;
		}
		if (num1 == 2) {
			System.out.println("Prime Number");
		}
		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0) {
				System.out.println("Error");
				return;
			}
		}
		System.out.println("Prime Number");

	}

	public void practice11() {

		int cut = 0;
		int num1 = 0;
		System.out.print("input : ");
		num = sc.nextInt();

		if (num < 2) {
			System.out.println("Error");
			return;
		}

		// 외부반복문 : 2~ 내가 입력한 값까지 반복.
		// 내부반복문 : 현재 값이 소수인지 아닌지 판단.
		int count = 0;
		for (int i = 2; i <= num; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.println(i + " ");

			}
		}
		System.out.println("count : " + count);

	}

	public void practice12() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 2; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}

		}
		System.out.println();
		System.out.print("count : " + count);
	}

	public static void main(String[] args) {
		LoopPractice lp = new LoopPractice();
		lp.practice12	();
	}
}
