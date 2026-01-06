package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			int count[] = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + count[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + count[1] + "명입니다.");

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
		while (true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");

			int count = pc.personCount()[0];

			if (count == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 입력이 불가합니다.");
			}

			System.out.print("메뉴번호 : ");
			int num = sc.nextInt();

			if (num == 1) {
				if (count == 3) {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요");
					continue;
				}
				insertStudent();
			} else if (num == 2) {
				printStudent();
			} else if (num == 9) {
				return;
			}
		}
	}

	public void employeeMenu() {
		System.out.print("");
	}

	public void insertStudent() {
		while (true) {			
			System.out.println("학생 이름 : ");
			String name = sc.next();

			System.out.println("학생 나이 : ");
			int age = sc.nextInt();

			System.out.println("학생 키 : ");
			double height = sc.nextDouble();

			System.out.println("학생 몸무게 : ");
			double weight = sc.nextDouble();

			System.out.println("학생 학년 : ");
			int salary = sc.nextInt();

			System.out.print("학생 전공 : ");
			String dept = sc.next();

			pc.inserStudent(name, age, height, weight, salary, dept);

	        // 2. 인원 체크 (먼저 수행)
	        if (pc.personCount()[0] == 3) {
	            System.out.println("학생을 담을 수 있는 공간이 꽉 찼으므로 종료합니다.");
	            break; 
	        }

	        // 3. 더 할지 물어보기
	        System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
	        char n = sc.next().charAt(0);
	        if (n == 'n' || n == 'N') {
	            break;
	        }
			
		}

	}

	public void printStudent() {
		Student [] s = pc.printStudent();
		for(Student std : s) {
			if (std != null) {
				System.out.println(std);
			}
		}
	}

	public void insertEmployee() {

	}

	public void printEmployee() {

	}
}
