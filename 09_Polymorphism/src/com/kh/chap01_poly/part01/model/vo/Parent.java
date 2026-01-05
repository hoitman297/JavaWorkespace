package com.kh.chap01_poly.part01.model.vo;

public class Parent {
	private int x;
	private int y;

	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void printParent() {
		System.out.println("부모클래스의 메소드");
	}

	public void print() {
		System.out.println("오버라이딩한 자식 메서드1");
	}

}
