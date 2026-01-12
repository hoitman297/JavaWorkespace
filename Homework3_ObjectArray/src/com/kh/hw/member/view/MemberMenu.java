package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() {

	}

	public void mainMenu() {
		while (true) {
			int memberNum = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원 수는 " + memberNum + "명입니다. ");

			if (memberNum != MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다. ");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				if (memberNum != MemberController.SIZE) {
					insertMenu();
					break;
				} else {
					System.out.println("잘못입력했습니다.");
				}
			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return;
			default:
				System.out.println("잘못입력.");
			}
		}
	}

	public void insertMenu() {
		System.out.print("아이디 : ");
		String id = sc.next();

		boolean isDup = mc.checkId(id);
		if (isDup) { // 중복인 경우
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			insertMenu();
			return;
		}

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("비밀번호 : ");
		String password = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		char gender = '\u0000';
		while (true) {
			System.out.print("성별 : ");
			gender = sc.next().toUpperCase().charAt(0);

			if (gender == 'M' || gender == 'F') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();

		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("9. 메인으로 돌아가기 ");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 9:
			return;
		}
	}

	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를 
		System.out.print("검색할 아이디 : ");
		String searchId = sc.next();
		
		String result = mc.searchId(searchId);
		
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(result);
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void searchName() {
		// 검색할 이름을 사용자에게 입력 받고 입력 받은 데이터를 
		// mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라  
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감 
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후 
		// 회원 검색 결과 출력  
		System.out.print("검색할 이름 : ");
		String searchName = sc.next();
		
		Member[] result = mc.searchName(searchName);
		
		if(result != null) {
			System.out.println("찾으신 회원 조회 결과입니다.");
			for( Member m : result) {
				System.out.println(m);
			}
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void updateMember() {

	}

	public void updatePassword() {
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		
		System.out.print("수정할 회원 비밀번호 : ");
		String password = sc.next();
		
		boolean result = mc.updatePassword(id, password);
		if(result) {
			System.out.println("비밀번호 변경 성공");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteMember() {
		System.out.print("번호 선택(1,2,9) : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			return;
		}
	}

	public void deleteOne() {
		System.out.print("삭제할 회원 아이디 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		
		boolean result = mc.delete(id);
		if(result) {
			System.out.println("성공적으로 삭제하였습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우 
		// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후 
		// mainMenu()로 돌아감 
		System.out.print("정말 삭제하시겠습니까(y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch != 'Y') {
			System.out.println("메인으로 돌아갑니다.");
			return;
		}
		mc.delete();
		System.out.println("성공적으로 삭제하였습니다.");
	}

	public void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데 
		// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력, 
		// 0명이 아니면 저장된 모든 회원의 정보 출력 
		Member[] m = mc.printAll();
		int memberNum = mc.existMemberNum();
		
		if(memberNum == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}
		
		for(Member mem : m) {
			if(mem != null)
				System.out.println(mem);
		}
		
	}

}









