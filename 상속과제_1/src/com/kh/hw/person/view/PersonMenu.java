package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.personCount() + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.personCount() + "명입니다.");

			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");

			int num = sc.nextInt();

			if (num == 1) {
				studentMenu();
			} else if (num == 2) {
				employeeMenu();
			} else if (num == 9) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("error 다시 입력하세요.");
				continue;
			}

		}
	}

	public void studentMenu() {
		System.out.print("1. 학생 추가");
		System.out.print("2. 학생 보기");
		System.out.print("9. 메인으로");
		
		int num = sc.nextInt();
		
		if (num == 1) {
			insertStudent();
		} else if(num == 2) {
			printStudent();
		} else if(num == 3) {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
	}

	public void employeeMenu() {
		System.out.print("");
	}

	public void insertStudent() {
		System.out.print("학생 이름 : ");
		String name = sc.next();
		
		System.out.print("학생 나이 : ");
		int age = sc.nextInt();
		
		System.out.print("학생 키 : ");
		double height = sc.nextDouble(); 
		
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		
		System.out.print("학생 학년 : ");
		int salary = sc.nextInt();
		
		System.out.print("학생 전공 : ");
		String dept = sc.next();
		
		pc.inserStudent(name, age, height, weight, salary, dept);
		
		System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
		char n = sc.next().charAt(0);
		
		if (n == 'n' || n == 'N') {
			return;
		} else{
			insertStudent();
		}
		
	}

	public void printStudent() {

	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}
}
