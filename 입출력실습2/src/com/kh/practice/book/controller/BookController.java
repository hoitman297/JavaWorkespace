package com.kh.practice.book.controller;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {
	BookDAO bd = new BookDAO();

	public void makeFile() {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt",true));
		} catch (IOException e) {
			// TODO Auto-generated catch block
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