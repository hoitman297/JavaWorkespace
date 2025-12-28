
package com.kh.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class A_Array {
	Scanner sc = new Scanner(System.in);

	public void method1() {
		int a;
		int arr[];
		int[] arr1;

		arr = new int[5];
		int arr3[] = new int[5]; // [0, 0, 0, 0, 0]

		int arr5[] = new int[5];
		System.out.println(arr3[3]);

		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;

		System.out.println(arr3); // 참조형 변수
	}

	public void method2() {
		int num = 10;
		int iArr[] = new int[5]; // 00000
		int iArr2[] = new int[11];
		System.out.println("iArr : " + iArr);
		System.out.println("iArr의 HashCode : " + iArr.hashCode());// 주소값을 10진수로 변경해주는 함수
		System.out.println("iArr의 HashCode : " + iArr2.hashCode());// 주소값을 10진수로 변경해주는 함수
		int iArr3[] = iArr2;
		System.out.println(iArr3.hashCode());

		System.out.println(iArr == iArr2); // false
		System.out.println(iArr2 == iArr3); // true
	}

	public void method3() {
		int iArr[] = new int[5];

		// 배열 값 초기화
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i;
			System.out.println(iArr[i]);
		}
	}

	public void method4() {
		int result = 0;
		String str = null; // " ";
		int[] arr = null;
		arr = new int[5];

		// null은 모든 참조자료형의 기본값이다.
		// 단, 참조변수가 null을 저장한 상태에서, 주소값이 있어야 수행할 수 있는 행위를 코드로 작성하면 실행시 에러

		System.out.println(arr.length);
		System.out.println(arr[0]);
	}

	public void method5() {
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = arr.length - 1; i > -1; i--) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
		arr[5] = 12;
		// 배열의 크기를 벗어난 인덱스 제시시 에러 발생.
		// 배열은 한번 "지정한 크기를 변경할 수 없다."
		// 배열의 범위를 넘어선 값들을 저장하고자 한다면, 새로운 배열을 생성해야한다.

		arr = new int[6];
		arr[5] = 12; // 기존 0~4번 인덱스의 값은 0으로 돌아간다.
	}

	public void method6() {
		// 배열의 선언, 할당, 초기화를 한번에 수행하는 방법.

		int arr[] = new int[] { 1, 2, 3, 4 };
		
		int arr2[] = { 1, 2, 3, 4 };

	}

	public void method7() {
		String str = "merry";
		
		// 1. toCharArray() 함수 사용
		char[] arr = str.toCharArray(); 
		
		// 2. for문으로 문자배열 생성하여 옮겨담기
		
		char[] arr2 = new char[str.length()];
		
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = str.charAt(i);
		}
		//Arrays.toString(배열명); => 배열 내부의 값들을 배열 형태로 변환하여 보여주는 매서드
		System.out.println(arr2);
		System.out.println( Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		A_Array aa = new A_Array();
		aa.method7();
	}
}
