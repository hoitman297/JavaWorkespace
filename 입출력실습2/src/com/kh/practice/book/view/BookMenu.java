package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	Book bArr[];

	public BookMenu() {
		bc.makeFile();
	}

	public void mainMenu() {
		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				fileSave();
				break;

			case 2:
				fileRead();
				break;

			case 9:
				return;

			default:
				continue;
			}

		}
	}

	public void fileSave() {
		int count = 0;
		System.out.print("도서 명 : ");
		String title = sc.nextLine();

		System.out.print("저자 명 : ");
		String author = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();

		System.out.print("출판 날짜(yyyy-mm-dd) : ");
		String dateStr = sc.nextLine();

		String[] dateArr = dateStr.split("-");
		int year = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int day = Integer.parseInt(dateArr[2]);

		Calendar publishDate = Calendar.getInstance();
		publishDate.set(year, month - 1, day);

		System.out.print("할인율 : ");
		double db = sc.nextDouble();

		bArr[count++] = new Book(title, author, price, publishDate, db);

		bc.fileSave(bArr);

	}

	public void fileRead() {
		bc.fileRead();
	}
}
