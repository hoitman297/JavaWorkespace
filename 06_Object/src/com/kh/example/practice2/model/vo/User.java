package com.kh.example.practice2.model.vo;

public class User {
	private String userId;
	private int age;
	private char gender;
	/*
	 	생성자
	 	[표현법]
	 	public 클래스명([매개변수]){
	 	 //생성자를 통해 객체 생성시 실행할 코드
	 	 
	 	}
	 	생성자를 작성하는 목적
	 	1. 객체를 생성해주기 위함
	 	2. 객체생성과 동시에 매개변수로 전달된 값을 통해 필드를 초기화할 목적으로도 사용
	
	 	생성자 작성 시 주의사항
	 	1. 클래스명과 동일해야한다
	 	2, 반환형이 존재하지 않는다.
	 	3. 여러개 생성이 가능하지만, 매개변수가 중복되면 안된다(메서드 오버로딩과 동일한 개념)
	 	4. 매개변수 생성자를 명시적으로 작성하게 되면, 기본 생성자를 jvm이 만들어주지 않는다.
		
		
		기본 생성자
		- 생성자 미 작성시 JVM이 자동으로 만들어주는 생성자
	 */
	
	public User() {
		System.out.println("기본생성자 호출");
	}
}
