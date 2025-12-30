package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	private int type;
	private int menuNum;

	public void inputMenu() {
		while (true) {
			System.out.println("======= 도형 프로그램 =======");
			System.out.println("3. 삼각형");
			System.out.println("4. 사격형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호");
			type = sc.nextInt();
			if (type == 3) {
				triangleMenu();
			} else if (type == 4) {
				squareMenu();
			} else if (type == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 번호입니다.");
				continue;
			}
		}

	}

	public void triangleMenu() {
		while (true) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");

			System.out.print("메뉴번호 : ");
			menuNum = sc.nextInt();
			if (menuNum == 1 || menuNum == 2) {
				inputSize(type, menuNum);
			} else if (menuNum == 3) {
				printInformation(type);
			} else if (menuNum == 9) {
				inputMenu();
				break;
			}
		}


	}

	public void squareMenu() {

	}


	public void inputSize(int type, int menuNum) {
		if(type == 3 && menuNum == 1) {
			System.out.println("높이 : ");
			double height = sc.nextDouble();
			System.out.println("너비 : ");
			double width = sc.nextDouble();
			System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
		}

	}

	public void printInformation(int type) {
		if(type == 1) {
			String result = tc.print();
		}

	}
}
