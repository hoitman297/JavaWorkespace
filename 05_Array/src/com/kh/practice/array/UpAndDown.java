package com.kh.practice.array;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void upAndDown() {
		int count = 0;
		int answer = sc.nextInt();
		while (true) {
			
			
			System.out.print("1 ~ 100 : ");
			int input = sc.nextInt();
			
			if (input < 1 || input > 100) {
				System.out.println("start again");
				continue;
			} 
			if(input < answer) {
				System.out.println("Up!");
				count++;
			}else if(input > answer) {
				System.out.println("Down!");
				count++;
			}else {
				
				count++;
				System.out.println("정답");
				System.out.println(count + "회만에 정답");
				
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		UpAndDown gaem = new UpAndDown();
		gaem.upAndDown();
	}
}
