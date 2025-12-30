package com.kh.example.practice6.model.vo;

public class Book {
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	/*
	 	1. 초기화 블럭
	 	2. setter
	 	3. 생성자
	 */
	
	public Book() {
		
	}
	
	public Book(String title,String publisher, String author) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
	}
	
	public Book(String title,String publisher, String author, int price, double discountRate) {
		this(title,publisher,author);
		this.price = price;
		this.discountRate = discountRate;
	}
	
	public void inform() {
		System.out.println(title);
		System.out.println(publisher);
		System.out.println(author);
		System.out.println(price);
		System.out.println(discountRate);
	}
}
