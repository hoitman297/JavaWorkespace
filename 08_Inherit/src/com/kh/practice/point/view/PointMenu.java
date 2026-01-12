package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.print("===== 메뉴 ===== \r\n"
					+ "	  1. 원  ➔ circleMenu() \r\n"
					+ "	  2. 사각형 ➔ rectangleMenu() \r\n"
					+ "	  9. 끝내기 \r\n"
					+ "	  메뉴 번호 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: 
				circleMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;				
			}
		}
		
		
	}
	
	public void circleMenu() {
		while(true) {
			System.out.print("===== 원 메뉴 ===== \r\n"
					+ "		 1. 원 둘레 ➔ calcCircum() \r\n"
					+ "		 2. 원 넓이 ➔ calcCircleArea() \r\n"
					+ "		 9. 메인으로 \r\n"
					+ "		 메뉴 번호 : "); 
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				calcCircum();
				break;
			case 2: 
				calcCircleArea();
				break;
			case 9:
				return;
			}
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
			
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcCircum(x, y, radius);
		System.out.println(result);
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
			
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		String result = cc.calcArea(x, y, radius);
		System.out.println(result);
	}
	
	
}

















