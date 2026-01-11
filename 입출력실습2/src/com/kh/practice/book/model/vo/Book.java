package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discoount;
	
	
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

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdf.format(date.getTime());
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", date=" + dateStr + ", discoount="
				+ discoount + "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscoount() {
		return discoount;
	}

	public void setDiscoount(double discoount) {
		this.discoount = discoount;
	}

	public Book() {
		
	}

	public Book(String title, String author, int price, Calendar date, double discoount) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discoount = discoount;
	}
	

}
