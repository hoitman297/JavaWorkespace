package com.kh.example.practice2.model.vo;

public class Circle {
	public static final double PI = 3.14;
	public static int radius = 1;
	
	public Circle() {}
	
	public void incrementRadius() {
		this.radius += 1;
	}
	
	public void getAreaOfCircle() {
		System.out.println(this.PI * 2 * this.radius);
	}
	
	public void getSizeOfCircle() {
		System.out.println(this.radius * this.radius * this.PI);
	}
	
}
