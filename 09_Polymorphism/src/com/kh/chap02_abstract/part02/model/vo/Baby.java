package com.kh.chap02_abstract.part02.model.vo;

// 인터페이스 상속
// - 클래스와 클래스의 상속 관계 (단일상속) : 클래스명 extends 부모클래스
// - 클래스와 인터페이스 상속 관계(다중상속) : 클래스명 implements 인터페이스 1, 인터페이스 2, 3....
// - 인터페이스 와 인터페이스의 상속 관계(다중상속) : 인터페이스명 extends 인터페이스1, 인터페이스2, 3....
public class Baby extends Person implements Basic{

	public Baby(){
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name,weight,health);
	}
	
	
	@Override
	public void eat() {
		setWeight(getWeight()+ 3); 
		setWeight(getWeight()+ 1); 
	}

	@Override
	public void sleep() {
		setWeight(getWeight()+ 3); 
		
	}

	@Override
	public String toString() {
		return "Baby [toString()=" + super.toString() + "]";
	}

}
