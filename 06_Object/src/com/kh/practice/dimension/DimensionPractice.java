package com.kh.practice.dimension;

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
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice4() {
		int num[][] = new int[4][4];
		int a = 0;
		int b = 0;
		for (int i = 0; i < num.length - 1; i++) {
			for (int j = 0; j < num[i].length - 1; j++) {
				num[i][j] = (int) (Math.random() * 10 + 1);
			}
		}

		for (int i = 0; i < num.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < num[i].length - 1; j++) {
				count += num[i][j];
			}
			num[i][3] = count;
		}

		for (int i = 0; i < num.length - 1; i++) {
			int count = 0;
			for (int j = 0; j < num[i].length - 1; j++) {
				count += num[j][i];
			}
			num[3][i] = count;
		}
			for (int j = 0; j < num.length-1; j++) {
				a = num[3][j] + a;
			}
			for (int j = 0; j < num.length - 1; j++) {
				b = b + num[j][3];
			}
		
		num[3][3] = a+b;
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
	}

	public static void main(String[] args) {
		DimensionPractice dp = new DimensionPractice();
		dp.practice4();
	}
}
