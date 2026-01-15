package com.kh.practice.thread;

<<<<<<< HEAD
/**
 * 사용자 정의 예외 클래스
 * Exception을 상속받아 일반 예외로 처리
 */
public class EmptyException extends Exception {
    
    // 생성자: 예외 발생 시 보여줄 메시지를 전달받음
    public EmptyException(String message) {
        // 전달받은 메시지를 부모 클래스(Exception)의 생성자로 넘겨줌
        // 이렇게 해야 e.getMessage() 호출 시 해당 메시지를 가져올 수 있음
        super(message);
    }
=======
public class EmptyException extends Exception{
	public EmptyException(String mesage) {
		super(mesage);
	}
>>>>>>> branch 'main' of https://github.com/hoitman297/JavaWorkespace.git
}