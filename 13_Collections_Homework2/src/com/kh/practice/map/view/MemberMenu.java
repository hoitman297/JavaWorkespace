package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	/**
	 * 메인 메뉴 출력 및 선택
	 */
	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		
		while (true) {
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine(); // 엔터키(개행문자) 제거용

			switch (menu) {
			case 1:
				joinMembership(); // 회원가입 실행
				break;
			case 2:
				logIn();      // 로그인 실행
				memberMenu(); // 로그인 성공 루틴 후 회원 메뉴 실행
				break;
			case 3:
				sameName();   // 같은 이름 찾기 실행
				break;
			case 9:
				System.out.println("프로그램 종료.");
				return; // main 메서드로 돌아가 프로그램 종료
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}
		}
	}

	/**
	 * 로그인 성공 시 보여줄 회원 메뉴
	 */
	public void memberMenu() {
		while (true) {
			System.out.println("******* 회원 메뉴 *******");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			System.out.print("메뉴 번호 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기

			switch (menu) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return; // mainMenu()로 복귀
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	/**
	 * 회원가입 화면
	 */
	public void joinMembership() {
		System.out.println("======= 회원 메뉴 =======");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		// 입력받은 정보로 Member 객체 생성
		Member m = new Member(password, name);
		
		// Controller로 전달 후 결과 수신
		boolean result = mc.joinMembership(id, m);
		
		if (result) {
			System.out.println("성공적으로 회원가입 완료하였습니다.");
		} else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}

	/**
	 * 로그인 화면 (성공할 때까지 반복)
	 */
	public void logIn() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			// 로그인 시도 후 이름 반환받음
			String name = mc.logIn(id, password);
			
			if (name != null) {
				System.out.println(name + "님, 환영합니다!");
				return; // 로그인 성공 시 메서드 종료 -> memberMenu() 호출됨
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}

	/**
	 * 비밀번호 변경 화면
	 */
	public void changePassword() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("현재 비밀번호 : ");
			String oldPw = sc.nextLine();
			System.out.print("새로운 비밀번호 : ");
			String newPw = sc.nextLine();
			
			// Controller로 변경 요청
			boolean result = mc.changePassword(id, oldPw, newPw);
			
			if (result) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return; // 성공 시 종료
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	/**
	 * 이름 변경 화면
	 */
	public void changeName() {
		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine();
			
			// 이름 변경 전 본인 확인 절차 (로그인 메서드 재활용)
			String currentName = mc.logIn(id, password);
			
			if (currentName != null) {
				System.out.println("현재 설정된 이름 : " + currentName);
				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				
				// Controller로 이름 변경 요청
				mc.changeName(id, newName);
				System.out.println("이름 변경에 성공하였습니다.");
				return;
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			}
		}
	}

	/**
	 * 같은 이름 회원 찾기 화면
	 */
	public void sameName() {
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		// Controller로부터 결과 Map 받기
		TreeMap<String, String> result = mc.sameName(name);
		
		// entrySet()을 이용하여 반복 출력 (요구사항: 이름-아이디 형식)
		for (Entry<String, String> entry : result.entrySet()) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
	}
}