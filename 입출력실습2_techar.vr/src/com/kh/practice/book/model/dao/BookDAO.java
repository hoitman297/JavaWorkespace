package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
	        for (Book b : bArr) {
	            if (b != null) {
	                oos.writeObject(b);
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

	public Book[] fileRead() {
		bArr = new Book[10]; 
	    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))) {
	        int index = 0;
	        while (index < bArr.length) {
	            try {
	                bArr[index++] = (Book) ois.readObject();
	            } catch (EOFException e) {
	                break;
	            }
	        }
	    } catch (FileNotFoundException e) {
	        // 파일 없으면 그냥 빈 배열 리턴
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	    }
	    return bArr;
	}
}
