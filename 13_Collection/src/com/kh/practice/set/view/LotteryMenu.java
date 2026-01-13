package com.kh.practice.set.view;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();

	public void mainMenu() {

		while (true) {
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인 ");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색 ");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 :");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				continue;
			}
		}
	}

	// 1. 추첨 대상 추가용 view 메소드
	public void insertObject() {
		System.out.print("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		String name = null, phone = null;

		for (int i = 0; i < num; i++) {
			System.out.print("이름 : ");
			name = sc.nextLine();
			System.out.print("전화번호 : ");
			phone = sc.nextLine();

			boolean result = lc.insertObject(new Lottery(name, phone));
			if (!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--; // 반복 횟수를 하나 줄여서 다시 해당 순번을 입력받게 함
			} else {
				System.out.println("추가 완료되었습니다.");
			}
		}

//		추가할 추첨 대상 수를 입력 받아 입력한 수만큼
//		추첨자 이름(String name)과 추첨자 핸드폰 번호(String phone)를 받고,
//		매개변수 생성자를 이용해 Lottery 객체에 추첨자 정보 저장.
//		Lottery 객체를 lc(LotteryController)의 insertObject로 전달하는데
//		단, 중복된 추첨 대상 입력했거나 또는 이미 추첨 Set에 대상이 있는 경우
//		“중복된 대상입니다. 다시 입력하세요.” 출력 후 이어서 다시 객체 입력.
//		모든 입력이 완료되면 “추가 완료되었습니다” 출력.
	}

	public void deleteObject() {
		System.out.print("삭제할 이름 : ");
		String name = sc.next();
		
		System.out.println("삭제할 전화번호 : ");
		String phone = sc.next();
		
		Lottery remove = new Lottery(name,phone);
		boolean result = lc.deleteObject(remove);
		if(result) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
		
	}

	// 3. 당첨 대상 확인용 view 메소드
	public void winObject() {
		Set s = lc.winObject();
		System.out.println(s);
//			lc에서 받아온 Set객체를 println()메소드를 통해 출력
	}

	// 4. 정렬된 당첨 대상 확인
	public void sortedWinObject() {
		TreeSet<Lottery> set = lc.sortedWinObject();
		
		Iterator<Lottery> l = set.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
//			lc에서 받아온 Set객체를 Iterator를 통해 출력
	}

	// 5. 당첨 대상 검색용 view 메소드
	public void searchWinner() {
//			검색할 대상의 이름과 핸드폰 번호를 받고 매개변수 있는 Lottery 생성자를 이용해
//			객체에 정보를 담아 lc에 객체를 보냄.
		
		System.out.print("검색 : ");
		String name = sc.next();
		
		System.out.println("전화번호 : ");
		String phone = sc.next();
		
		Lottery l = new Lottery(name, phone);
		boolean result = lc.searchWinner(l);
		if(result) {
			System.out.println("축하");
		} else {
			System.out.println("다음 기회에...");
		}
//			받은 결과에 따라 true면 “축하합니다. 당첨 목록에 존재합니다.”,
//			false면 “안타깝지만 당첨 목록에 존재하지 않습니다.” 출력
	}
}
