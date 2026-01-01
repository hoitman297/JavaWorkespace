package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	int input;

	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
			System.out.println("현재 등록된 회원 수는 " + mc.exitstMemberNum() + "입니다.");
			if (mc.exitstMemberNum() < 10) {
				System.out.println("new 회원");
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				input = sc.nextInt();
				if (input == 1) {
					insertMember();
				} else if (input == 2) {
					searchMember();
				} else if (input == 3) {
					updateMember();
				} else if (input == 4) {
					deleteMember();
				} else if (input == 5) {
					printAll();
				} else if (input == 9) {
					break;
				} else {
					System.out.println("Error");
					continue;
				}
			} else if (mc.exitstMemberNum() == 10) {
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				input = sc.nextInt();
				if (input == 2) {

				} else if (input == 3) {
					searchMember();
				} else if (input == 4) {
					updateMember();
				} else if (input == 5) {
					deleteMember();
				} else if (input == 9) {
					break;
				} else {
					System.out.println("Error");
					continue;
				}
			}
		}
	}

	public void insertMember() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			if (mc.checkId(id)) {
				System.out.println("아이디가 중복 되었습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("비밀번호 : ");
			String password = sc.next();
			System.out.print("이메일 : ");
			String email = sc.next();
			char gender;
			while (true) {
				System.out.print("성별 : ");
				gender = sc.next().charAt(0);
				if (gender == 'm' || gender == 'M') {
					gender = 'M';
					break;
				} else if (gender == 'f' || gender == 'F') {
					gender = 'f';
					break;
				}else {
					System.out.println("다시 입력하세요");
					continue;
				}
			}
			System.out.print("나이 : ");
			int age = sc.nextInt();
			mc.intsertMember(id, name, password, email, gender, age);
			break;
		}
		System.out.println("새회원을 등록합니다");
		mainMenu();
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			searchId();
		}else if (num == 2) {
			searchName();
		}else if (num == 3) {
			searchEmail();
		}else if (num == 9) {
			mainMenu();
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.println(mc.searchId(id));
	}

	public void searchName() {
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		sc.nextLine();
	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		sc.nextLine();
		System.out.println(mc.searchId(email));
	}

	public void updateMember() {

	}

	public void updatePassword() {

	}

	public void updateName() {

	}

	public void updateEmail() {

	}

	public void deleteMember() {

	}

	public void deleteOne() {

	}

	public void deleteAll() {

	}

	public void printAll() {

	}
}
