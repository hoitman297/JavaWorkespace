package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int num[][] = new int[3][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = j;
				System.out.print("(" + i + ", " + num[i][j] + ") ");
			}
			System.out.println();
		}
	}

	public void practice2() {
		int num[][] = new int[4][4];
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = ++count;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice3() {
		int num[][] = new int[4][4];
		int count = 16;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j] = count--;
				System.out.printf("%4d",num[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
	    int[][] num = new int[4][4];
	    for (int i = 0; i < 3; i++) {
	        for (int j = 0; j < 3; j++) {
	            num[i][j] = (int)(Math.random() * 10 + 1);;
	            num[i][3] += num[i][j];      // 가로 합 누적
	            num[3][j] += num[i][j];      // 세로 합 누적
	            num[3][3] += num[i][j] * 2;      // 전체 총합 누적
	        }
	    }

	    for (int i = 0; i < num.length; i++) {
	        for (int j = 0; j < num[i].length; j++) {
	            System.out.printf("%4d", num[i][j]);
	        }
	        System.out.println();
	    }
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int withd = sc.nextInt();
		
		System.out.print("열 크기 : ");
		int height = sc.nextInt();
		
		if(!(1 <= withd && withd <= 10 && 1 <= height && height <= 10)){
			System.out.println("error");
			return;
		}
		
		char arr[][] = new char[withd][height];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int ran = (int)(Math.random()*26)+65;
				arr[i][j] = (char)(ran);
				System.out.printf(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}	

	public static void main(String[] args) {
		DimensionPractice dp = new DimensionPractice();
		dp.practice5();
	}
}
