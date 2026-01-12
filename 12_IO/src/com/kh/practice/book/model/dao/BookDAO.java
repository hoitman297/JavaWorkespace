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
	private Book[] bArr= new Book[10];
	
	public void fileSave(Book[] bArr) {
		// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에  
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("book.txt"))){
			for(Book b : bArr) {
				if(b != null)
					oos.writeObject(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Book[] fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("book.txt"));){
			int index = 0;
			while(true) {
				Book b = (Book) ois.readObject();
				bArr[index] = b;
				index += 1;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			// 파일의 끝
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return bArr;
	}
	
}





