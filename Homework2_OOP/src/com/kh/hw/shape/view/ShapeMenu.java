package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	
	public void inputMenu() {
		// ===== 도형 프로그램 ===== 
		// 3. 삼각형  	==> triangleMenu() 
		// 4. 사각형 	==> squareMenu() 
		// 9. 프로그램 종료 => “프로그램 종료” 출력 후 프로그램 종료 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			System.out.println("===== 도형 프로그램 ===== ");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 3: 
				triangleMenu(); 
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}
	
	public void triangleMenu() {
		// ===== 삼각형 ===== 
		// 1. 삼각형 면적 ==> inputSize() 
		// 2. 삼각형 색칠 ==> inputSize() 
		// 3. 삼각형 정보 ==> printInformation() 
		// 9. 메인으로 ==> “메인으로 돌아갑니다.” 출력 후 inputMenu()로 
		// 메뉴 번호 : 
		// 잘못 입력했을 시 “잘못된 번호입니다. 다시 입력해주세요.” 출력 후 반복
		while(true) {
			System.out.print("메뉴번호");
			int menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				inputSize(3 , 1);
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로");
				return;
			default:
				System.out.println("잘못입력했습니다.");
			}
			
		}
		
		
	}
	
	public void squareMenu() {
		
	}
	
	public void inputSize(int type, int menuNum) {
	  // 매개변수로 들어온 type과 menuNum의 숫자에 따라 출력이 달라짐 
	  if(type == 3) {
		  if(menuNum == 1) {
			  System.out.print("높이 : ");
			  double height = sc.nextDouble();
			  
			  System.out.print("너비 : ");
			  double width = sc.nextDouble();
			  
			  System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
		  }
		  else {
			  System.out.print("색 : ");
			  String color = sc.next();
			  tc.paintColor(color);
			  System.out.println("색이 수정되었습니다.");
		  }
	  }
	}
	
	public void printInformation(int type) {
		if(type == 3) {
			System.out.println(tc.print());
		}else {
			System.out.println(scr.print());
		}
	}
	
}













