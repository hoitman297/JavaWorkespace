package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice {		
	Scanner sc = new Scanner(System.in);

	public void pratice1() {
		System.out.print("±¹¾î : ");
		double kor = sc.nextDouble();
		System.out.print("¿µ¾î : ");
		double eng = sc.nextDouble();
		System.out.print("¼öÇÐ : ");
		double mth = sc.nextDouble();
		
		int sum = (int)(kor+ eng + mth);
		int avg = sum / 3;
		
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}
	public void method() {
		int iNum1 = 10;
		int iNum2 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		System.out.println( iNum1 / iNum2 ); // 2
		System.out.println((int)dNum); // 2
		System.out.println( (double)iNum1); // 10.0
		System.out.println( (double)iNum2 * dNum); // 10.0
		System.out.println( (double)(iNum1 / iNum2)); // 2.5
		System.out.println( (float)dNum ); // 2.5
		System.out.println( (double)dNum ); // 3
		System.out.println( (int)(iNum1 / fNum) ); // 3
		System.out.println( (float)(iNum1 / fNum));// 3.3333333
		System.out.println((double)(iNum1 / fNum) ); // 3.3333333333333335
		System.out.println( (char)((iNum1 * iNum2) + (iNum1 * dNum)) ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + iNum1 ); // 75
		System.out.println((char)(ch +iNum1) ); // 'K'
	}

}
