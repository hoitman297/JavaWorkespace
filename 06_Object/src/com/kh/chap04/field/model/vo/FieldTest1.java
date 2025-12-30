package com.kh.chap04.field.model.vo;

public class FieldTest1 {
	/*
	 	필드 === 인스턴스 변수 === 멤버 변수
	 	
	 	변수 구분
	 	- 전역변수 : 클래스영역 바로 아래에 선언하는 변수를 의미.
	 				   클래스 내부라면 어디서든 사용가능
	 	- 지역변수 : 클래스 영역 내에서 특정영역({})에 선언한 변수를 의미.
	 				   선언한 영역에서만 사용이 가능(if, 메서드, for ....)
	 				   
	 	1. 전역변수
	 	- 필드 == 인스턴스 변수 == 멤버변수
	 	  생성시점 : 객체가 메모리에 할당되면서 생성. (heep)
	 	  소멸시점 : 객체가 소멸할때 함께 소멸.
	 	  
	 	- 클래스변수 == static 변수
	 	  생성시점 : 프로그램 시작과 동시에 static영역에 메모리 할당 (static)
	 	  소멸시점 : 프로그램 종료시.
	 	  
	 	2. 지역변수
	 	 생성시점 : 특정영역({}) 이 실행될 때 저장공간이 할당(stack)
	 	 소멸시점 : 특정영역이 끝날 때.
	 	
	 */
	private int global;//전역변수 (필드)
	{
		//초기화 블럭
		//객체 생성 시 최초 1회 실행
		global = 50;
	}
	
	public static int num;
	//static 초기화 블럭
	static {
		
		//static 변수를 초기화 하는데 사용한다.
		//프로그램 실행될때 최초 1번 실행 (싱글턴 패턴)
		
		num = 55;
	}
	public void test(int num) {//매개변수 (지역변수)
		int local = 0;
		
		if(true) {
			int a = 0;
		}
		System.out.println(global);
		//전역변수의 저장위치는 heep 메모리영역이며, 이 공간은 비버있을 수 없기 때문에 jvm 자료형의 기본값으로 초기화 시켜두었다.

		System.out.println(local);
		//초기화 하지 않으면 오류
		
		System.out.println(num);
		//메서드 호출을 위해선 초기화 필수
		//System.out.println(a);
		
		FieldTest2 tf2 = new FieldTest2();
		System.out.println(tf2.pub);
		System.out.println(tf2.pro);
		System.out.println(tf2.df);
		
	}
	
public static void main(String[] args) {
	FieldTest1 ft = new FieldTest1();
	ft.test(10);
	}
}
