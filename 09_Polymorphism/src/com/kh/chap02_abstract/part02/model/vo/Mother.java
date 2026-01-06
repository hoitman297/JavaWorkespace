package com.kh.chap02_abstract.part02.model.vo;

public class Mother extends Person implements Basic {

	private String babyBirth; // 아기의 탄생 여부: 출산, 입양, 없음요

	public Mother() {
		// TODO Auto-generated constructor stub
	}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name,weight,health);
		this.babyBirth = babyBirth;
	}
	
	
	
	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	
	@Override
	public void eat() {
		//엄마가 밥을 먹으면
		//몸무게 10 증가, 건강도 10 감소.
		// TODO Auto-generated method stub

		setWeight(getWeight() + 10);
		setHealth(getHealth() - 10); 
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		setHealth(getHealth() + 10);
	}

	@Override
	public String toString() {
		return "Mother [toString()=" + super.toString() + "]";
	}

	
	
}
