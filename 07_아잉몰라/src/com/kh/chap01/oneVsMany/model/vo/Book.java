package com.kh.chap01.oneVsMany.model.vo;

import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {
		
	}
	
	public Book(String title, String author,int price,String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//모든 필드 정보를 문자열로 반환시켜주는 메소드
	public String information() {
		return title + ", " + author + ", " + price + ", " + publisher;
	}
	
	
	
}
