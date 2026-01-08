package com.kh.practice.charCheck.exception;


//사용자 정의 예외 클래스: 문자열 검사 중 발생하는 예외를 처리함
public class CharCheckException  extends Exception{
	// 기본 생성자
	public CharCheckException(){
		
	}
	// 예외 메시지를 매개변수로 받는 생성자
	public CharCheckException(String msg) {
		// 부모 Exception 클래스의 생성자를 호출하여 메시지 저장
		super(msg);
	}
}
