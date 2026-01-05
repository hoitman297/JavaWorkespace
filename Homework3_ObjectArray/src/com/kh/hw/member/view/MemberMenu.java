package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	int input;

	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		while (true) {
			System.out.println();
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
					return;
				} else {
					System.out.println("Error");
					continue;
				}
			} else if (mc.exitstMemberNum() == 10) {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				input = sc.nextInt();
				if (input == 2) {
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
					gender = 'F';
					break;
				} else {
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
		} else if (num == 2) {
			searchName();
		} else if (num == 3) {
			searchEmail();
		} else if (num == 9) {
			mainMenu();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void searchId() {
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		sc.nextLine();
		System.out.println("조회하신 결과입니다.");
		System.out.println(mc.searchId(id));
	}

	public void searchName() {

		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member result[] = mc.searchName(name);
		sc.nextLine();
		System.out.println("조회하신 결과입니다.");
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == null) {
				count++;
			}
		}
		if (count == 10) {
			System.out.println("검색 결과가 없습니다");
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] != null && result[i].getName().equals(name)) { // null은 실체가 없기 때문에 getName 실행 불가
				System.out.println(result[i].inform());

			}
		}

	}

	public void searchEmail() {
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		sc.nextLine();
		Member result[] = mc.searchEmail(email);
		System.out.println("조회하신 결과입니다.");
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == null) {
				count++;
			}
		}
		if (count == 10) {
			System.out.println("검색 결과가 없습니다");
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] != null && result[i].getEmail().equals(email)) { // null은 실체가 없기 때문에 getName 실행 불가
				System.out.println(result[i].inform());

			}
		}
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		if (num == 1) {
			updatePassword();
		} else if (num == 2) {
			updateName();
		} else if (num == 3) {
			updateEmail();
		} else if (num == 9) {
			mainMenu();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void updatePassword() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();

		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		sc.nextLine();

		if (mc.updatePassword(id, password)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();

		System.out.print("수정할 이름 : ");
		String name = sc.next();
		sc.nextLine();

		if (mc.updateName(id, name)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();

		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		sc.nextLine();

		if (mc.updateEmail(id, email)) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();

		if (num == 1) {
			deleteOne();
		} else if (num == 2) {
			deleteAll();
		} else if (num == 9) {
			mainMenu();
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		sc.nextLine();

		System.out.print("정말 삭제하겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		sc.nextLine();

		mc.delete(id);

		if (yn == 'y' && yn == 'Y') {
			if (mc.delete(id)) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				System.out.println("삭제 실패하였습니다.");
			}
		} else if (yn == 'n' && yn == 'N') {
			mainMenu();
		}

	}

	public void deleteAll() {
		System.out.print("정말 삭제하겠습니까? (y/n) : ");
		char yn = sc.next().charAt(0);
		sc.nextLine();
		if (yn == 'y' || yn == 'Y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		} else if (yn == 'n' || yn == 'N') {
			mainMenu();
		}

	}

	public void printAll() {
		for (Member mb : mc.printAll()) {
			if (mb != null) {
				System.out.println(mb.inform());
			}
		}
	}
}
