package com.kh.practice.book.controller;

import java.io.FileWriter;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd = new BookDAO();

	public void makeFile() {
        // 기존 코드 유지: 단순히 파일을 생성하거나 초기화하는 용도
        try (FileWriter fw = new FileWriter("book.txt", true)) {
            // 파일 생성 로직
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void fileSave(Book[] bArr) {
		bd.fileSave(bArr);
	}

	public Book[] fileRead() {
		return bd.fileRead();
	}
}