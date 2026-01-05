package com.kh.chap01_poly.part01.model.vo;

public class Chilld_2 extends Parent {

	public Chilld_2() {

	}

	public Chilld_2(int x, int y) {
		super(x, y);
	}

	public void printChild2() {
		System.out.println("차윌드 투");
	}

	public void print() {
		System.out.println("오버라이딩 자식메서드2");
	}
}
