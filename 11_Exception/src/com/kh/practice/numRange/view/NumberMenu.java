package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		System.out.print("정수1 : ");
		int num = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean result = nc.checkDouble(num, num2);
			System.out.println(num+"은 "+num2+"의 배수? "+result);
		}catch(NumRangeException e) {
			e.printStackTrace();
		}
	}
}
