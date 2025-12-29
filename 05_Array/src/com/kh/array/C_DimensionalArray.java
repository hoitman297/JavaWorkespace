package com.kh.array;

import java.util.Iterator;

public class C_DimensionalArray {
	public void method1() {

		/*
		 2차원 배열 선언
		 1. 자료형 배열명 [][];
		 2. 자료형 [] 배열명 [];
		 3.자료형 [][] 배열명;
		 */
		
		int arr3[][];
		arr3 = new int[2][3];
		
		//선언과 동시에 할당
		int arr[][] = new int[3][5];
		
		System.out.println(arr); //2차원 배열의 주소값
		System.out.println(arr[0]); //2차원 배열의 행 주소값
		System.out.println(arr[0][0]); // 1행 1열의 값
		System.out.println(arr.length); // 행 길이 출력
		System.out.println(arr[0].length); // 열 길이 출력
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		int arr[][] = new int[3][5];
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
	
	public void method3() {
		int arr [][] = {{1,2,3,4,5},
						 {1,2,3,4,5},
						 {1,2,3,4,5}};
		int arr2[][] = new int[3][];
		
		System.out.println(arr2[0]);
		arr2[0] = new int[2];
		arr2[1] = new int[3];
		arr2[2] = new int[1];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr[i][j] = j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		/*
		 가변배열
		 - 행의 크기는 정해져 있으나, 행별 열의 갯수가 정해지지 않은 배열을 의미함.
		 - 이차원 배열은 1차원배열을 여러개 묶음으로 관리하는 형태긴 하지만, 일차원 배열의 크기가 꼭 같을 필요는 없음.
		 */
	}
	
	public void method4() {
		/*
		 char[][] 가변배열을 생성 후 문자를 저장하시오.
		 최종 출력 형태
		 1행 [a, b, c]
		 2행 [d, e]
		 3행 [f, g, h, i]
		 
		 */
		
		int ch[][] = new int [3][];
		int as = 65;
		ch[0] = new int[3];
		ch[1] = new int[2];
		ch[2] = new int[4];
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				ch[i][j] = as;
				System.out.print((char)ch[i][j] + " ");
				as++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		C_DimensionalArray cd = new C_DimensionalArray();
		cd.method4();
	}
}
