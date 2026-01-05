package com.kh.chap02_abstract.part01.model.run;

import com.kh.chap02_abstract.part01.model.vo.Basketball;
import com.kh.chap02_abstract.part01.model.vo.Football;
import com.kh.chap02_abstract.part01.model.vo.Sports;

public class Run {
	public static void main(String[] args) {
		// 추상클래스로 객체생성?
		//  - 추상클래스는 객체 생성이 불가능
		//  - 참조변수로는 사용이 가능
		// Sports s = new Sports();
		
		Sports s = new Football();
		Sports s1 = new Basketball();
		Sports arr[] = new Sports[2];
		
		arr[0] = s;
		arr[1] = s1;
		
		for(Sports spo : arr) {
			spo.rule();
		}
	}
	/*
	 	추상클래스 정리
	 	- 추상클래스란 미완성된 부분이 존재하는 클래스임을 의미(abstract class)
	 	- 미완성된 클래스이기 때문에 객체 생성은 불가능하나, 참조변수로는 사용이 가능하다
	 	- 추상 메서드가 포함된 경우, 클래스는 반드시 추상 클래스로 정의해야 한다.
	 	- 추상클래스는 "일반 필드", "일반 메서드", "생성자", "추상메서드" 로 이루어져 있다.
	 */
}
