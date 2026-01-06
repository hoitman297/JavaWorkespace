package com.kh.chap01_math.run;

public class B_StringBuilder_And_Buffer {
	/*
		StringBuilder and StringBuffer
		- 문자열 기반 가변클래스
		- 문자열의 메모리 부족 이슈를 해결하기 위해 만들어진 클래스
		- 두 클래스의 사용방법은 동일함
		- 차이점은 "동기화"여부
		-StringBuilder는 동기화를 지원하지 않기 때문에 "멀티스레드환경"에서 좋은 성능을 보인다.
		-StringBuffer는 동기화를 지원하기 때문에 '멀티스레드환경'에서 스레드 안전성을 보장할 수 있으나 성능이 좋지 못하다.
	 */
	public void method() {
		String str = "Hello";
		str += "World";
		
		StringBuilder sb1 = new  StringBuilder();
		
		StringBuffer sb11 = new StringBuffer("hello");
		sb11.append("World");
		sb11.append("!!!!");
		
		StringBuffer sb2 = new StringBuffer("hello");
		sb2.append("World");
		
		System.out.println(sb11);
		System.out.println(sb2);
		
		//문자열 길이
		System.out.println(sb11.length());
		
		//특정 문자 찾기
		System.out.println(sb11.lastIndexOf("o"));
		
		// 문자 전체 삭제
//		System.out.println(sb11.delete(0, sb11.length()-1));
		
		//마지막 문자만 삭제
		System.out.println(sb11.deleteCharAt(sb11.length()-1));
	}
}
