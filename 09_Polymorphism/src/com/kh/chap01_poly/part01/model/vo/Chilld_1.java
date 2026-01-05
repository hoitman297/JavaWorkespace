package com.kh.chap01_poly.part01.model.vo;

public class Chilld_1 extends Parent {
	private int z;

	public Chilld_1() {
		// TODO Auto-generated constructor stub
	}

	public Chilld_1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public Chilld_1(int z) {
		this.z = z;
	}

	public void printChild1() {
		System.out.println("촤윌드 메서드");
	}

	public void print() {
		System.out.println("오버라이딩 자식메서드1");
	}
}
