package com.kh.chap02_abstract.part02.run;

import com.kh.chap02_abstract.part02.model.vo.Baby;
import com.kh.chap02_abstract.part02.model.vo.Basic;
import com.kh.chap02_abstract.part02.model.vo.Mother;
import com.kh.chap02_abstract.part02.model.vo.Person;

public class Run {
	public static void main(String[] args) {
		//추상클래스
		// - 객체 생성 불가. 단, 참조변수로는 사용 가능.
		//Person p = new Person();
		Person p1 = new Mother("명지원",64,0,"입양");
		Person p2 = new Baby("명춘백",5, 100);
	
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("다음날");
		System.out.println(p1);
		System.out.println(p2);
		
		//인터페이스
		//Basic b = new Basic(); 객체 생성 불가능
		Basic b1 = new Mother("명지원", 50, 70, "출산");
		Basic b2 = new Baby("웅애", 3.5, 70);
		
		b1.eat();
		b2.eat();
		
		System.out.println(b1);
		System.out.println(b2);
		
	}
}
