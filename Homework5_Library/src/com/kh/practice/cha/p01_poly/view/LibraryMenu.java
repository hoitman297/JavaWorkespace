package com.kh.practice.cha.p01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		Member mem = new Member(name, age, gender, 0);
		lc.insertMember(mem);
		
		
		while (true) {
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			
			int num = sc.nextInt();
			if (num == 1) {
				System.out.println(lc.myInfo());;
			} else if (num == 2) {
				selectAll();
			} else if (num == 3) {
				searchBook();
			} else if (num == 4) {
				rentBook();
			} else if (num == 9) {
				return;
			}
		}
	}
	
	public void selectAll() {
		for (int i = 0; i < lc.selectAll().length; i++) {
			System.out.println(i + "번도서 :  " + lc.selectAll()[i]);
		}
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 : ");
		String keyword = sc.next();
		
		Book[] searchBookList = lc.searchBook(keyword);
		
		for(Book b : searchBookList) {
			if(b != null) System.out.println(b);
		}
		
	}
	
	public void rentBook() {
		System.out.print("대여할 도서 번호 선택: ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		if (index == 0) {
			lc.rentBook(0);
		} else if (index == 1) {
			lc.rentBook(1);
		} else if (index == 2) {
			lc.rentBook(2);
		}
	}
	
}
