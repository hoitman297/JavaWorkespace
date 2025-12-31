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
			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 :");
			type = sc.nextInt();
			if (type == 3) {
					triangleMenu();
			} else if (type == 4) {
					squareMenu();
			} else if (type == 9) {
				System.out.println("프로그램이 종료됩니다");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}

	public void triangleMenu() {
		System.out.println("메뉴번호");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
				case 1:
					inputSize(type,menuNum);
					break;
				case 2:
					inputSize(type,menuNum);
					break;
				case 3:
					printInformation(menuNum);
					break;
				case 9:
					System.out.println("메인으로");
					inputMenu();
					break;
				
		}
	}

	public void squareMenu() {

	}


	public void inputSize(int type, int menuNum) {
		if (type == 3 && menuNum == 1) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.println("너비 : ");
			double width = sc.nextDouble();
			System.out.println("삼각형 면적 : " + tc.calcArea(height, width)); 
		}
		else {
			System.out.println("색 : ");
			String color = sc.next();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}

	}

	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
			
		}

	}
}
