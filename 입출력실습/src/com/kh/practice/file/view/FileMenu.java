package com.kh.practice.file.view;

import java.util.Scanner;
import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		while (true) { // 반복 구조 유지 위해 추가
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기 -> 프로그램 종료");
			int num = sc.nextInt();
			sc.nextLine();
			switch (num) {
			case 1: fileSave(); break;
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: return;
			default: System.out.println("잘못 입력함");
			}
		}
	}

	public void fileSave() {
		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요 (exit 입력 시 종료): ");
			String str = sc.nextLine();
			if (str.equals("exit")) break;
			sb.append(str).append("\n"); // 가독성 위해 줄바꿈 추가
		}

		System.out.print("저장할 파일 명을 입력해주세요 : ");
		String fileName = sc.nextLine();
		boolean iF = fc.checkName(fileName);

		if (!iF) {
			fc.fileSave(fileName, sb);
		} else {
			while (true) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n): ");
				char ch = sc.nextLine().toUpperCase().charAt(0);
				if (ch == 'Y') {
					fc.fileSave(fileName, sb);
					break;
				} else if (ch == 'N') {
					// 다시 파일명을 입력받는 네 로직 유지
					System.out.print("저장할 파일 명을 다시 입력해주세요 : ");
					fileName = sc.nextLine();
					if(!fc.checkName(fileName)) {
						fc.fileSave(fileName, sb);
						break;
					}
				}
			}
		}
	}

	public void fileOpen() {
		System.out.println("열 파일 명 : ");
		String fileName = sc.nextLine();
		boolean exists = fc.checkName(fileName);
		
		if(!exists) {
			System.out.println("없는 파일입니다.");
			return;
		}
		System.out.println(fc.fileOpen(fileName));
	}

	public void fileEdit() {
		System.out.print("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		if (!fc.checkName(fileName)) {
			System.out.println("없는 파일입니다.");
			return;
		}

		StringBuilder sb = new StringBuilder();
		while (true) {
			System.out.println("파일에 추가할 내용을 입력하세요 (exit 입력 시 종료): ");
			String str = sc.nextLine();
			if (str.equals("exit")) break;
			sb.append(str).append("\n");
		}
		fc.fileEdit(fileName, sb);
	}
}