package com.kh.practice1.model.vo;

public class Entry {
	String key;
	Snack val;
	Entry next;
	public Entry(String key, Snack val, Entry next) {
		this.key = key;
		this.val = val;
		this.next = next;
	}
	
	
}
