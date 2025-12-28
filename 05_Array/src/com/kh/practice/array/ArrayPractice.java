package com.kh.practice.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int num[] = new int[10];

		for (int i = num.length - 1; i > -1; i--) {
			for (int j = 0; j < num.length; j++) {
				num[j] = i;
			}
			System.out.print(num[0] + 1 + " ");
		}
	}

	public void practice2() {
		System.out.print("input  ");
		int ip = sc.nextInt();
		int num[] = new int[ip];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}

	public void practice3() {
		int num[] = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			System.out.print(num[i] + " ");
		}
	}

	public void practice4() {
		char yk[] = { '월', '화', '수', '목', '금', '토', '일' };
		System.out.print(" input (0~6)  ========= ");
		int num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println(yk[num]);
			break;
		case 1:
			System.out.println(yk[num]);
			break;
		case 2:
			System.out.println(yk[num]);
			break;
		case 3:
			System.out.println(yk[num]);
			break;
		case 4:
			System.out.println(yk[num]);
			break;
		case 5:
			System.out.println(yk[num]);
			break;
		case 6:
			System.out.println(yk[num]);
			break;

		default:
			System.out.println("error");
			break;
		}
	}

	public void practice5() {
		System.out.println("input================> ");
		int num = sc.nextInt();
		int num1[] = new int[num];
		int inp = 0;
		for (int i = 0; i < num; i++) {
			System.out.print("num" + i + " : ");
			inp = sc.nextInt();
			num1[i] = inp;
			System.out.println();
		}
		int sum = 0;
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] + " ");
			sum += num1[i];
		}
		System.out.println();
		System.out.println(sum);
	}

	public void practice6() {
		System.out.print("input ========> ");
		String str = sc.next();
		int count = 0;
		char ch[] = new char[str.length()];
		System.out.print("output =========> ");

		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					System.out.print(ch[i]);
					count++;
				} else if (ch[i] == ch[j]) {
					break;
				}
			}
		}
		System.out.println("\ncount ============ " + count);
	}

	public void 예제1() {
		System.out.print("input ========> ");
		String str = sc.next();
		int count = 0;
		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			boolean isDup = false;
			for (int j = 0; j < i; j++) {
				if (ch == arr[j]) {
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				count++;
				System.out.print(ch + " ");
			}
		}

		System.out.println("\n" + count);
	}

	public void practice7() {
		System.out.print("input ========> ");
		String str1 = sc.next();
		System.out.print("input ========> ");
		char chr = sc.next().charAt(0);

		char m[] = new char[str1.length()];

		int count = 0;

		System.out.print("output =======> ");
		for (int i = 0; i < m.length; i++) {
			m[i] = str1.charAt(i);
			if (m[i] == chr) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + count);

	}

	public void practice8() {
		System.out.print("input ========> ");
		String num = sc.next();
		char ch[] = num.toCharArray();
		char 자료[] = { '*', '*', '*', '*', '*', '*', '*' };
		char copy[] = new char[ch.length];
		System.arraycopy(ch, 0, copy, 0, 14);
		System.arraycopy(자료, 0, copy, 7, 7);
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}

	public void practice9() {
		int num[] = new int[10];
		int max = 0;
		int min = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			System.out.print(num[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			} else if (min > num[i]) {
				min = num[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

	public void practice10() {
		int num[] = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j < num.length; j++) {
				if (j == i) {
					System.out.print(num[i] + " ");
				} else if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}

	}

	public void practice11() {
		while (true) {
			System.out.println();
			System.out.print("input : ");
			int num = sc.nextInt();
			int arr[] = new int[num];
			if (num % 2 == 0 || num < 3) {
				System.out.print("rtry \n");
				continue;
			}

			for (int i = 0; i <= arr.length / 2; i++) {
				arr[i] = i + 1;
				System.out.print(arr[i] + " ");
			}
			for (int i = arr.length / 2; i > 0; i--) {
				arr[i] = i;
				System.out.print(arr[i] + " ");
			}

		}
	}

	public void practice12() {

		int size = 0;
		int sizeadd = 0;
		System.out.print("size input : ");
		size = sc.nextInt();
		String str[] = new String[size];
		for (int i = 0; i < str.length; i++) {
			System.out.print(i + 1 + " input : ");
			str[i] = sc.next();
			sc.nextLine();
		}
		while (true) {
			System.out.print("Add (y / n) : ");
			char ad = sc.next().charAt(0);
			if (ad == 'y' || ad == 'Y') {
				System.out.print("add size input : ");
				sizeadd = sc.nextInt();
				String strAdd[] = new String[str.length + sizeadd];
				System.arraycopy(str, 0 , strAdd, 0 , str.length);
				for (int i = str.length; i < strAdd.length; i++) {
					System.out.print(i + 1 + " input : ");
					strAdd[i] = sc.next();
				}
				str = strAdd;
			} else if (ad == 'n' || ad == 'N') {
				System.out.println(Arrays.toString(str));
				break;
			}
		}
	}

	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
		ap.practice12();
	}
}
