package com.kh.practice.list.music.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();

	public void mainMenu() {

		while (true) {
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");

			System.out.println("메뉴 번호 선택 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				remobeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				return;

			default:
				break;
			}
		}
	}

	public void addList() {
		System.out.print("곡 명 : ");
		 String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		int result = mc.addList(new Music(title,singer));
		if(result == 1) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
		
	}

	public void addAtZero() {
		System.out.print("곡 명 : ");
		 String title = sc.nextLine();
		System.out.print("가수 명 : ");
		String singer = sc.nextLine();
		
		int result = mc.addZtZero(new Music(title,singer));
		if(result == 1) {
			System.out.println("저장 성공");
		} else {
			System.out.println("저장 실패");
		}
	}

	public void printAll() {
		List list = mc.printAll();
		for(Object l : list) {
			System.out.println(l);
		}
	}

	public void searchMusic() {
		System.out.print("특정 곡 찾기 : ");
		String str = sc.next();
	
		Music m = mc.searchMusic(str);
		
		if(m == null){
			System.out.println("검색 결과가 없습니다");
		}else {
			System.out.println(m);
		}
	}

	public void remobeMusic() {
		System.out.print("특정 곡 지우기 : ");
		String str = sc.next();
	
		Music m = mc.searchMusic(str);
		
		if(m == null){
			System.out.println("검색 결과가 없습니다");
		}else {
			printAll();
		}
	}

	public void setMusic() {
		System.out.println("검색할 곡명 : ");
		String title = sc.nextLine();
		
		System.out.println("수정할 곡명 : ");
		String title2 = sc.nextLine();
		
		System.out.println("수정할 가수명 : ");
		String singer = sc.nextLine();
		
		Music m = mc.setMusic(title2, new Music(title2,singer));
		
		if(m == null){
			System.out.println("수정할 곡이 없습니다.");
		}else {
			System.out.println(m + "의 값이 변경 되었습니다.");
		}
	}

	public void ascTitle() {
		int result = mc.ascTitle();
		
		if(result == 1) {
			System.out.println("정렬 성공");
		} else {
			System.out.println("정렬 실패");
		}
		
	}

	public void descSinger() {

	}
}
