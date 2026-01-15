package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;

public class FarmMenu {
	FarmController fc = new FarmController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		while (true) {
			System.out.println("========= KH 마트 =========");
			System.out.println("****** 메인 메뮤 ******");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;

			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				 continue;
				
			}
		}
	}

	public void adminMenu() {
		System.out.println("****** 직원 메뉴 ******");
		System.out.println("1. 새 농산물 추가");
		System.out.println("2. 종류 삭제");
		System.out.println("3. 수량 수정");
		System.out.println("4. 농산물 목록");
		System.out.println("9. 메인으로 돌아가기");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			addNewKind();
			break;
		case 2:
			remobeKind();
			break;
		case 3:
			changeAmount();
			break;
		case 4:
			printFarm();
			break;
		case 9:
			mainMenu();
			break;
		default:
			adminMenu();
			break;
		}
	}

	public void customerMenu() {

	}

	public void addNewKind() {

	}

	public void remobeKind() {

	}

	public void changeAmount() {

	}

	public void printFarm() {

	}

	public void buyFarm() {

	}

	public void removeFarm() {

	}

	public void printBuyFarm() {

	}
}
