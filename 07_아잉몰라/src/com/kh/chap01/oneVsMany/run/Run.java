package com.kh.chap01.oneVsMany.run;

import java.util.Iterator;
import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class Run {
	public static void main(String[] args) {
		//객체배열 없이 코딩하기
		// 1. setter 초기화
		Book bk1 = new Book();
		bk1.setTitle(null);
		bk1.setPrice(0);
		bk1.setPublisher(null);
		bk1.setAuthor(null);
		
		// 2. 매개변수 생성자로 객체 생성 및 초기화
		Book bk2 = new Book("C언어", "명지원" , 21000, "이지스");
		Book bk3 = new Book("원피스", "오다" , 10000, "이지스");
		
		for (int i = 0; i < 3; i++) {
			if(i == 0) {
				System.out.println(bk1.information());
			}
			else if(i == 1) {
				System.out.println(bk2.information());
			} else {
				System.out.println(bk3.information());
			}
		}
		//객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리해줘야 한다.
		Book arr[] = new Book[3];
		arr[0] = bk2;
		arr[1] = bk3;
		arr[2] = bk1;
		
		//배열을 통해 도서정보 출력 서비스 만들기
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("num : ");
		int num = sc.nextInt();
		sc.nextLine();

		Book book[] = new Book[num];
		
		for (int i = 0; i < book.length; i++) {
			System.out.print("title : ");
			String title = sc.next();
			sc.nextLine();
			System.out.print("author : ");
			String author = sc.next();
			sc.nextLine();
			System.out.print("price : ");
			int price = sc.nextInt();
			System.out.print("publisher : ");
			String publisher = sc.next();
			sc.nextLine();
			
			book[i] = new Book(title,author,price,publisher);
		}
		
		System.out.println("title : ");
		String searchTitle = sc.next();
		
		for (int i = 0; i < book.length; i++) {
			if(searchTitle.equals(book[i].getTitle())) {
				System.out.println(book[i].information());
			}
		}
	}
}
