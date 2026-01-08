package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	NumberController nc = new NumberController();
	public void menu() {
		try {
			System.out.print("input 1 ======= ");
			int num1 = sc.nextInt();
			
			System.out.print(" \n input 2 ======= ");
			int num2 = sc.nextInt();
			System.out.println();
			
			System.out.println(num1 + "은 (는) " + num2 + "의 배수인가 ? " + nc.checkDouble(num1, num2));
		} catch (NumRangeException ne) {
			ne.printStackTrace();
		}
	}
}
